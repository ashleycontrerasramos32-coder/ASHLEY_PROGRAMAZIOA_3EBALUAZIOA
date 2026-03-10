package ud6_2zatia;

import java.util.ArrayList;
import java.util.Iterator;

//ARIKETA 1

public class Sorta1_Ariketa1 {
	
	  public static void zerrendaKargatu(ArrayList<Integer> zenbakiak) { 
	        for (int i=0; i<20; i++) {
	            zenbakiak.add((int)(Math.random()*201)-100);
	        }
	   } 
	  
	  public static void bistaratu(ArrayList<Integer> zenbakiak) {
		  //for normala
		  /*
	        for(int i=0; i<zenbakiak.size();i++) {
	        	System.out.print(zenbakiak.get(i)+"\t");
	        }
	        */
	        
	        //iterator erabiltzen
	        Iterator<Integer> it=zenbakiak.iterator();
	        while(it.hasNext()) {
	        	System.out.print(it.next()+"\t");
	        }
	   }
	  
	  public static void zatitzaileak10(ArrayList<Integer> zenbakiak, int n) {
	        int kont=0;
	        for (int i=1;i<=n && kont<10;i++) {
	        	if(n%i==0) {
	        		zenbakiak.add(i);
	        		kont++;
	        	}
	            
	        }
	    }

	  
	  public static void ausazkoakBikoiztuakOnartuGabe(ArrayList<Integer> zenbakiak) {
		  for (int i=0; i<20; i++) {
	            int zenb=(int)(Math.random()*41)-20;
	           while(zenbakiak.contains(zenb)) {
	        	   zenb=(int)(Math.random()*41)-21;
	           }
	           zenbakiak.add(zenb);    
	        }
		  System.out.println(zenbakiak);
	    }
	  
	    public static void main(String[] args) { // main metodoa

	    ArrayList<Integer> zenbakiak=new ArrayList<>();

	    //20 ausazko zenbakiak -100 eta 100 artean
	    
	    zerrendaKargatu(zenbakiak);
	    bistaratu(zenbakiak);
	    zenbakiak.clear();
	    System.out.println();

	    //10 zatitzaileak
	    System.out.println();
	    zatitzaileak10(zenbakiak, 10);
	    bistaratu(zenbakiak);
	    zenbakiak.clear();
	    System.out.println();

	    //20 ausazko zenbakiak -20 y 20 bikoiztuak onartu gabe
	    System.out.println();
	    for (int i=0; i<20; i++) {
            int zenb=(int)(Math.random()*41)-20;
           while(zenbakiak.contains(zenb)) {
        	   zenb=(int)(Math.random()*41)-21;
           }
           zenbakiak.add(zenb);    
        }
	  System.out.println(zenbakiak);
    
	}


}
