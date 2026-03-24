package fitxategiak;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
			BufferedWriter bw=new BufferedWriter(new FileWriter(txtfitx, true));
			bw.write(p.getIzena()+";"+p.getNAN()+";"+p.getAdina());
			bw.close();
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
		
		//OBJEKTUEN FITXATEGIA IRAKURRI
		
		

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		zerrendaIkusi(ObjektuFitxategirikZerrendara("pertsonak.obj"));
		pertsonaBerriaGehitu(new Pertsona("Ashley", "58005150R", 19), "Pertsonak.txt", "pertsonak.obj"); 
		
		
	}

}
