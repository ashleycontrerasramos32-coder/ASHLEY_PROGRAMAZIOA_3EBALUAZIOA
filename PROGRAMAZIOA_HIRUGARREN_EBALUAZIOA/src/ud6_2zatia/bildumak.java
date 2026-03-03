package ud6_2zatia;

import java.util.ArrayList;


public class bildumak {
	
	public static void main(String[] args) {
		
		
		/*
		ArrayList<Integer> zerrenda1=new ArrayList<Integer>();
		System.out.println(zerrenda1.size());
		zerrenda1.add(17);
		System.out.println(zerrenda1.size());
		System.out.println(zerrenda1);
		zerrenda1.add(33);
		zerrenda1.add(33);
		zerrenda1.add(42);
		System.out.println(zerrenda1);
		System.out.println(zerrenda1.size());
		
		for(int i=0; i<zerrenda1.size();i++) {
			System.out.println(zerrenda1.get(i));
		} 
		*/
		
		ArrayList<Pertsona> pertsonak=new ArrayList<Pertsona>();
		
		Pertsona p1=new Pertsona("1234567x", "Mikel", 23);
		pertsonak.add(p1);
		pertsonak.add(new Pertsona("33333333n", "Miren", 20));
		System.out.println(pertsonak);
		
		for(int i=0; i<pertsonak.size(); i++) {
			System.out.println(pertsonak.get(i));
		}
		for(Pertsona p:pertsonak) {
			p.setAdina(33);
			System.out.println(p);
		}
		
		
		
		
	}

}
