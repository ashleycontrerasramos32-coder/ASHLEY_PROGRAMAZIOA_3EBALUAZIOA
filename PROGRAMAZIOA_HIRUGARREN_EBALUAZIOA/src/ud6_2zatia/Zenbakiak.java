package ud6_2zatia;

import java.util.ArrayList;

//ARIKETA 1

public class Zenbakiak {
	
	  public static void ausazkoZenbakiak(ArrayList<Integer> zenbakiak) { 
	        for (int i=0; i<20; i++) {
	            int ausazkoak=(int)(Math.random()*201)-100;
	            zenbakiak.add(ausazkoak);
	        }
	   } 
	  
	  public static void bistaratu(ArrayList<Integer> zenbakiak) {
	        for(int i=0; i<zenbakiak.size();i++) {
	        	System.out.print(zenbakiak.get(i)+"\t");
	        }
	   }
	  
	  public static void zatitzaileak10(ArrayList<Integer> zenbakiak, int n) {
	        int kontZatitzaileak=0;

	        for (int i=1;i<zenbakiak.size();i++) {
	        	
	            
	        }
	    }

	  
	  public static void ausazkoakBikoiztuakOnartuGabe(ArrayList<Integer> zenbakiak) {
		  for (int i=0; i<20; i++) {
	            int ausazkoak=(int)(Math.random()*41)-20;
	           if(!zenbakiak.contains(ausazkoak)) {
	        	   zenbakiak.add(ausazkoak);
	           }
	            
	            
	        }
	    }
	  
	    public static void main(String[] args) { // main metodoa

	    ArrayList<Integer> zenbakiak=new ArrayList<>();

	    //20 ausazko zenbakiak -100 eta 100 artean
	    
	    ausazkoZenbakiak(zenbakiak);
	    bistaratu(zenbakiak);
	    zenbakiak.clear();
	    System.out.println();

	    //10 zatitzaileak
	    /* System.out.println();
	    zatitzaileak10(zenbakiak, 60);
	    bistaratu(zenbakiak);
	    zenbakiak.clear();
	    */

	    //20 ausazko zenbakiak -20 y 20 bikoiztuak onartu gabe
	    System.out.println();
	    ausazkoakBikoiztuakOnartuGabe(zenbakiak);
	    bistaratu(zenbakiak);

	 
	}


}
