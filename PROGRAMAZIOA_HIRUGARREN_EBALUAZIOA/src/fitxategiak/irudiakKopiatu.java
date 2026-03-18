package fitxategiak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class irudiakKopiatu {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("kopiatzekoIrudia.jpg"); // SARRERA
		FileOutputStream fos=new FileOutputStream("IrudiaKopiatuaBlokeetanZaborrikGabe.jpg");
		
		//BYTEZ-BYTE KOPIATU
		/*while(fis.available()>0) {
			fos.write(fis.read());
		}
		fis.close();
		fos.close();
		*/
		
		//BLOKEETAN KOPIATU
		
		/*
		byte[] buffer=new byte[1024];
		while(fis.available()>0) {
			fis.read(buffer);
			fos.write(buffer);
		}
		fis.close();
		fos.close();
		*/
		
		//BLOKEETAN KOPIATU BAINA ZABORRIK GABE
		byte[] buffer=new byte[1024];
		while(fis.available()>0) {
			int byteKopurua=fis.read(buffer);
			fos.write(buffer, 0, byteKopurua);
			
		}
		fis.close();
		fos.close();
		
	}

}
