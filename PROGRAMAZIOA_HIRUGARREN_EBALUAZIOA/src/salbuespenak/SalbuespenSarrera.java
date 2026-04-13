package salbuespenak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SalbuespenSarrera {
	
	public static void main(String[] args) {
	
		try (BufferedReader br=new BufferedReader(new FileReader("Pertsonak.txt")); // ERREKURTSOAK
				BufferedWriter bw=new BufferedWriter(new FileWriter("FitxategiaBerria.txt")) ) {
			String lerroa=br.readLine();
			while(lerroa!=null) {
				//lerroa bakoitzarekin egin beharrekoa
				lerroa=br.readLine();
				
			}
		} catch (FileNotFoundException e) { // AKATS KONKRETUA, CATCH ORDENAN JARRI BEHAR DA
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally { // FINALLY BLOKEA BETI EXEKUTATZEN DA
			System.out.println("Hau beti exekutatzen da, salbuespena egon edo ez");
		}
		//AUNQUE NOS DE UN ERROR, AL FINAL NOS SEGUIRÁ APARECIENDO LA FRASE
		System.out.println("Hau agertzen da"); 

		/*
		int zenbakia = 0;
		try {
			System.out.println("Sartu zenbaki bat");
			zenbakia=Kontsola.irakurriInt();
		}
		catch (NumberFormatException e) {
			System.out.println("Ez duzu zenbaki bat sartu");
			zenbakia=-1;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(zenbakia);
		 */
	}

}
