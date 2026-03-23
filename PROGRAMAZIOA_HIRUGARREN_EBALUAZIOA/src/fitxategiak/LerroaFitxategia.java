package fitxategiak;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LerroaFitxategia {
	
	public static void main(String[] args) throws IOException {
		

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Pertsonak.obj"));
		
		
		
		//BUFFER READER PERTSONAK SORTZEKO, OBJECT OUTPUT STRING BATEAN PERTSONAK SORTU FITXATEGIAN 
	
		BufferedReader br=new BufferedReader(new FileReader("Pertsonak.txt"));
		
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
		br.close();
		oos.writeObject(null);
		oos.close();
		

		
		
	}

}
