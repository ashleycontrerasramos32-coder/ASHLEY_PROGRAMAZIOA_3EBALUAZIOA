package fitxategiak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestuFitxategia {
	
	public static void main(String[] args) throws IOException {
		/*
		FileReader fr=new FileReader("Zenbakiak.txt");
		char[] buf=new char[12];
		
		int n=fr.read(buf);
		
		while(n!=-1) {
			for(int i=0; i<n; i++) {
				System.out.print(buf[i]);
			}
			n=fr.read(buf);
		}
		*/
		
		
		/*
		while(n!=-1) {
			System.out.print((char)n);
			n=fr.read();
		}
		*/
		
		//zaborrarekin
		/* FileReader fr=new FileReader("Zenbakiak.txt");
		FileWriter fw=new FileWriter("ZenbakiakKopia.txt");
		char[] buf=new char[12];
		int n=fr.read(buf);
		while(n!=-1) {
			fw.write(buf);
			n=fr.read(buf);
		}
		fr.close();
		fw.close();
		*/
		
		//zaborrik gabe
		/* FileReader fr=new FileReader("Zenbakiak.txt");
		FileWriter fw=new FileWriter("ZenbakiakKopia.txt");
		char[] buf=new char[12];
		int n=fr.read(buf);
		while(n!=-1) {
			fw.write(buf, 0,n);
			n=fr.read(buf);
		}
		fr.close();
		fw.close();
		*/
		BufferedReader br=new BufferedReader(new FileReader("Zenbakiak.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("ZenbakiakKopia.txt"));
		String lerroa=br.readLine();
		while(lerroa!=null) {
			bw.write(lerroa);
			bw.newLine();
			lerroa=br.readLine();
		}
		br.close();
		bw.close();
		
		//BUFFER READER PERTSONAK SORTZEKO, OBJECT OUTPUT STRING BATEAN PERTSONAK SORTU FITXATEGIAN 
		
		
	}

}
