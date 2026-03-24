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
import java.io.Reader;

public class TestuFitxategitikPertsonak {
	//TESTU FITXATEGITIK PERTSONAK SORTU ETA OBJEKTU FITXATEGIA SORTU
	public static void testuFitxategitikObjektuFitxategira(String txtFitx, String objFitx) throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader(txtFitx));
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(objFitx));
		String lerroa=br.readLine();
		while(lerroa!=null) {
			String [] zatiak=lerroa.split(";");
			String izena=zatiak[0];
			String nan=zatiak[1];
			int adina=Integer.parseInt(zatiak[2]);
			
			Pertsona p=new Pertsona(izena, nan, adina);
			oos.writeObject(p);
			System.out.println(p.toString());
			lerroa=br.readLine();
		}
		oos.writeObject(null);
		oos.close();
		br.close();
		
	}
	// OBJEKTU FITXATEGIA IRAKURRI
	public static void objektuenFitxategiaIrakurri(String objFitx) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(objFitx));
		Pertsona p=(Pertsona) ois.readObject();
		while(p!=null) {
			System.out.println(p.toString());
			p=(Pertsona) ois.readObject();
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/* BufferedReader br=new BufferedReader(new FileReader("Pertsonak.txt"));
		String lerroa=br.readLine();
		
		while(lerroa!=null) {
			String [] zatiak=lerroa.split(";");
			String izena=zatiak[0];
			String nan=zatiak[1];
			int adina=Integer.parseInt(zatiak[2]);
			Pertsona p=new Pertsona(izena, nan, adina);
			System.out.println(p.toString());
			lerroa=br.readLine();
		}
		br.close();
		*/
		
		//PARA AGREGAR PERSONAS EN EL MISMO FICHERO USANDO BUFFEREDWRITER 
		/* Pertsona p1=new Pertsona("Xabier", "58005250R", 23);
		Pertsona p2=new Pertsona("Maialen", "66005250R", 20);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("Pertsonak.txt", true));
		bw.write(p1.getIzena()+";"+p1.getNAN()+";"+p1.getAdina());
		bw.newLine();
		bw.write(p2.getIzena()+";"+p2.getNAN()+";"+p2.getAdina());
		bw.newLine();
		
		
		bw.close();
		*/
		testuFitxategitikObjektuFitxategira("Pertsonak.txt", "pertsonak.obj");
		objektuenFitxategiaIrakurri("pertsonak.obj");
		
		
	}


}
