package ud6_2zatia;

import java.util.ArrayList;
import java.util.Iterator;

public class ariketa2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> zerrenda=new ArrayList<String>();
		zerrenda.add("Kaixo");
		zerrenda.add("nire izena");
		zerrenda.add("Ashley da");
		zerrenda.add("eta 19 urte ditut");
		
		String esaldiLuzeena="";
		int max=-1;
		
		// 1. bukle normala
		/* for(int i=0; i<zerrenda.size(); i++) {
			System.out.println(zerrenda.get(i));

			
			if(zerrenda.get(i).length()>esaldiLuzeena.length()) {
				esaldiLuzeena=zerrenda.get(i);
			}
		}
		System.out.println();
		System.out.println("Hau da esaldi luzeena: "+esaldiLuzeena);
		*/
		
		System.out.println();
		
		//2. for hobetua (objetu mota aldagaia: objetu bilduma)
		/*for(String str:zerrenda) {
			if(str.length()>esaldiLuzeena.length()) {
				max=str.length();
				esaldiLuzeena=str;
				
			}
		}
		System.out.println("Hau da esaldi luzeena: "+esaldiLuzeena);
		*/
		
		// 3. iterator
		Iterator<String> it=zerrenda.iterator();
		while(it.hasNext()) {
			String katea=it.next();
			if(katea.length()>max) {
				max=katea.length();
				esaldiLuzeena=katea;
			}
		}
		System.out.println("Hau da esaldi luzeena: "+esaldiLuzeena);
		
		// 1. bukle normalarekin
		String galdetzekoKatea="hemeretzi";
		boolean baDago=false;
		for(int i=0; i<zerrenda.size() && !baDago; i++) {
			if(zerrenda.get(i).equals(galdetzekoKatea)) {
				baDago=true;
			}
		}
		if(baDago) System.out.println("Esaldia badago");
		else System.out.println("Esaldia ez dago");
		
		// 2. contains erabilita (equals metodoan oinarritzen da)
		if(zerrenda.contains(galdetzekoKatea)) System.out.println("Esaldia badago");
		else System.out.println("Esaldia ez dago");
		
		// 3. indexOf erabilita (-1 itzultzen badu ez dago)
		if(zerrenda.indexOf(galdetzekoKatea)!=-1) System.out.println("Esaldia badago");
		else System.out.println("Esaldia ez dago");

		
		
		
	}

}
