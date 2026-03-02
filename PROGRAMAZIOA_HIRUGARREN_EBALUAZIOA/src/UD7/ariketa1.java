package UD7;

import java.util.ArrayList;


public class ariketa1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> zerrenda=new ArrayList<Integer>();
		
		System.out.println(zerrenda.size());
		
		zerrenda.add(1);
		zerrenda.add(2);
		zerrenda.add(3);
		zerrenda.add(4);
		
		float batezbestekoa=0;
		int maximoa=-1;
		
		for(int i=0; i<zerrenda.size(); i++) {
			System.out.println(zerrenda.get(i));
			
			if(maximoa<zerrenda.get(i)) {
				maximoa=zerrenda.get(i);
			}
			
			batezbestekoa=zerrenda.get(i)+batezbestekoa;
			
			
			
		}
		System.out.println("Hau da batezbestekoa: "+(batezbestekoa/zerrenda.size()));
		System.out.println("Hau da maximoa: "+maximoa);
		
		
		
		
	}

}
