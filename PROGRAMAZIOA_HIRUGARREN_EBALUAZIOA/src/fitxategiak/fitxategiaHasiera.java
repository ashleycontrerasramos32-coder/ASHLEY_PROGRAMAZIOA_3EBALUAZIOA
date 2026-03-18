package fitxategiak;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fitxategiaHasiera {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("1adibidea.bin", true); //GAUZAK GEHITZEKO ETA FITXTAGEIA EZ MATXAKATU
		fos.write(65);
		fos.write(12);
		fos.write(107);
		fos.close(); 
	
	
		
		if(!new File("1adibidea.bin").exists()) { // MIENTRAS ESE FITXATEGIA NO EXISTA..
			System.out.println("Fitxategi horrek ez du existitzen");
		} else {
			
			FileInputStream fis=new FileInputStream("1adibidea.bin");
			byte [] buffer=new byte[2];
			while(fis.available()>0) {
				System.out.println(fis.read(buffer));
				for(int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
			fis.close();
			System.out.println("Fitxategia amaituta");
		}
		System.out.println("Programaren amaiera");
		
	
	}

}
