package salbuespenak;

import java.io.IOException;

public class ZatiZero {
	
	public static void main(String[] args) {
		int zenbaki1=0;
		int zenbaki2=0;
		int zenbakienZatiketa=0;
		try {
			System.out.println("Sartu zenbaki bat");
			try {
				zenbaki1=Kontsola.irakurriInt();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Sartu bigarreneko zenbaki bat");
			try {
				zenbaki2=Kontsola.irakurriInt();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			zenbakienZatiketa=zenbaki1/zenbaki2;
			
			
		}
		catch (ArithmeticException e) {
			System.out.println("Errorea:zati zero");
			
		}
		System.out.println("Hau da bi zenbakien zatiketa: "+zenbakienZatiketa);
		
	}

}
