package fitxategiak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class FitxategiakArrayetaIterator {
	
	//OBJEKTU FITXATEGITIK ARRAYLIST BAT ITZULI
	public static ArrayList <Pertsona> ObjektuFitxategirikZerrendara(String objFitx) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(objFitx));
		ArrayList<Pertsona> pertsonak=new ArrayList<Pertsona>();
		//pertsona bat sortu eta irakurri fitxategitik
		Pertsona p = (Pertsona) ois.readObject();
		
		
		while(p!=null) {
			pertsonak.add(p);
			p=(Pertsona) ois.readObject();
			
		}
		ois.close();
		return pertsonak;
		
	}
	//ArrayListeko Pertsonak erakutsi iteratzailea erabiliz
	public static void zerrendaIkusi (ArrayList<Pertsona> zerrenda) {

		Iterator<Pertsona> it=zerrenda.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	// pertsona berria bi fitxategietan gehitu
		public static void pertsonaBerriaGehitu(Pertsona p, String txtfitx, String objFitx) throws IOException, ClassNotFoundException {
			/* BufferedWriter bw=new BufferedWriter(new FileWriter(txtfitx, true));
			// HACIENDO LO DE BW. WRITE NO ESTAMOS AÑADIENDO LA INFORMACION DE UNA PERSONA NUEVA 
			bw.write(p.getIzena()+";"+p.getNAN()+";"+p.getAdina());
			// PONER BW NEW LINE PORQ SINO AL AGREGAR OTRA PERSONA NOS LO PONDRA EN LA MISMA LINEA
			bw.newLine();
			bw.close();
			*/
			PrintWriter pw=new PrintWriter(new FileWriter(txtfitx, true));
			//NO HACE FALTA PONER EN BW NEW LINE, SE SALTA LA LINEA SOLO
			pw.print(p.getIzena()+";"+p.getNAN()+";"+p.getAdina());
			pw.close();
			
			
			
			ArrayList<Pertsona> pertsonak=ObjektuFitxategirikZerrendara(objFitx);
			pertsonak.add(p);
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(objFitx));
			Iterator<Pertsona> it=pertsonak.iterator();
			while(it.hasNext()) {
				oos.writeObject(it.next());
			}
			oos.writeObject(null);
			oos.close();
			
	
		}
		
		// testu fitxategitik abiatuta metodoak jasotzen duen izena duen Pertsona itzuli (null ez badago)
		public static Pertsona pertsonaItzuli(String izena, String txtfitx) throws IOException {
			
			//LEHENENGO MODUA 
			// ARRAYLIST-A ITZULTZEN DUEN METODOA ERABILI ETA BERTAN KONPROBATU
			
			/* ArrayList<Pertsona> zerrenda=ObjektuFitxategirikZerrendara(txtfitx);
			Iterator<Pertsona> it=zerrenda.iterator();
			while(it.hasNext()) {
				Pertsona pe=it.next();
				if(pe.getIzena().equals(izena)) {
					return pe;
				}
			}
			return null;
			*/ 
			
			//BIGARRENEKO MODUA
			Pertsona bilatzekoPertsona=new Pertsona(izena, null, 0);
			
			BufferedReader br=new BufferedReader(new FileReader(txtfitx));
			String lerroa=br.readLine();
			while(lerroa!=null) {
				String [] zatiak=lerroa.split(";");
				
				//izenak berdintzen direla kontuan hartuta 
				/*if(zatiak[0].equals(izena)) {
					br.close();
					return new Pertsona(zatiak[0], zatiak[1], Integer.parseInt(zatiak[2]));
				}*/
				
				//bi pertsona berdintzen saiatuz
				Pertsona p=new Pertsona(zatiak[0], zatiak[1], Integer.parseInt(zatiak[2]));
				if(p.equals(bilatzekoPertsona)) {
					br.close();
					return p;
				}
				
				lerroa=br.readLine();
			}
			br.close();
			return null;
			
		}
		
		
		

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		/* zerrendaIkusi(ObjektuFitxategirikZerrendara("pertsonak.obj"));
		pertsonaBerriaGehitu(new Pertsona("Kevin", "58005150R", 19), "Pertsonak.txt", "pertsonak.obj");
		*/
		System.out.println(pertsonaItzuli("Ainhoa", "Pertsonak.txt"));
		
		
	}

}
