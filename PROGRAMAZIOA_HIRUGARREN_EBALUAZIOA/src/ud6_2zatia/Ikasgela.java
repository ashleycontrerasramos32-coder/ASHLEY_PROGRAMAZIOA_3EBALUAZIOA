package ud6_2zatia;

import java.util.ArrayList;
import java.util.Iterator;

public class Ikasgela {
	
	private String gela;
	private ArrayList<Ikaslea> zerrenda;
	
	public Ikasgela(String gela) {
		this.gela=gela;
		zerrenda=new ArrayList<Ikaslea>();
	}
	
	public void ikaselaGehitu(Ikaslea ik) {
		zerrenda.add(ik);
	}
	// Ikasgelaren informazioa erakutsi ikusi ditugun 3 modutan

	public void gelaIkusi() {
		
		System.out.println(gela);
		// 1. bukle normala
		
		/* for(int i=0; i<zerrenda.size(); i++) {
			zerrenda.get(i).erakutsi();
			
		}
		*/
		
		// 2. for hobetua. Zeharkatzen dugun objetua da Ikaslea
		/* for(Ikaslea ik:zerrenda) {
			ik.erakutsi();
		}
		*/
		
		// 3. iterator
		Iterator <Ikaslea> it=zerrenda.iterator();
		while(it.hasNext()) {
			// nola behin bakarrik jarri nahi dugu..
			it.next().erakutsi();
		}
		
	
		
	}
	
	// Ikasle bat dagoen itzultzen duen metodoa. Bi ikasleek berdinak dira izen eta adin berdina badute 
	public boolean ikasleaBadago(Ikaslea ik) {
		//equals metodoa biderdefinitu gabe. Ezin dugu contains edo indexOf erabili
		
		/* for(int i=0; i<zerrenda.size(); i++) {
			if(ik.getAdina()==zerrenda.get(i).getAdina() && ik.getIzena().equals(zerrenda.get(i).getIzena())) {
				System.out.println("Ikaslea bai dago");
				return true;
			}
		}
		System.out.println("Ikaslea ez dago");
		return false;
		*/
		
		// ITERATOR ERABILTZEN 
		/* Iterator <Ikaslea> it=zerrenda.iterator();
		while(it.hasNext()) {
			Ikaslea i=it.next();
			if(i.getIzena().equals(ik.getIzena()) && i.getAdina()==ik.getAdina()) {
				return true;
			}
	
		}
		return false;
		
		*/
		
		// equals metodoa birderfinitu 
		// return zerrenda.contains(ik);
		
		// beste modu batean
		if(zerrenda.indexOf(ik)!=-1) return true;
		return false;
		
		
		
	}
	
	//noten batazbestekoa 5 baino gutxiago duten ikasleak ezabatzeko metodoa. 
	//ZERRENDA ZEHARKATU ETA GERO GALDETU BOST BAINO GUTXIAGO DEN EDO EZ BATAZBESTEKOA, METODOARI DEITUZ. 
	
	public void nota5Gutxiago() {
		
		// indizea ondo kontrolatzen
		/*for(int i=0; i<zerrenda.size(); i++) {
			zerrenda.get(i).erakutsi();
			
			if(zerrenda.get(i).batezbestekoa()<5) {
				System.out.println("Noten batezbestekoa 5 baino txikiagoa da, zerrendatik ezabatuko dugu ikaslea");
				zerrenda.remove(i);
				i--;
				
			} else {
				System.out.println("Noten batezbestekoa 5 baino handiagoa da, zerrendan utziko dugu");
			}
			
		}
		*/
		
		//iteratzailea
		Iterator <Ikaslea> it=zerrenda.iterator();
		while(it.hasNext()) {
			if(it.next().batezbestekoa()<5) {
				System.out.println("Noten batezbestekoa 5 baino txikiagoa da, zerrendatik ezabatuko dugu ikaslea");
				it.remove();
			}
			else {
				System.out.println("Noten batezbestekoa 5 baino handiagoa da, zerrendan utziko dugu");
			}
		}
		
		
		
		
	}
	
	// nota guztiak gaindituta dituzteen ikasleen izenekin sortutuako ArrayList bat itzultzen duen metodoa
	public ArrayList<String> guztiakGainditutakoIkasleak() {
		ArrayList <String> guztiaGaindituta=new ArrayList<String>();
		for(int i=0; i<zerrenda.size(); i++) {
			if(	zerrenda.get(i).guztiaGaindituta()) {
				guztiaGaindituta.add(zerrenda.get(i).getIzena());
			}
		}
		return guztiaGaindituta;
	}
	
	
	public static void main(String[] args) {
		
		/*Ikasgela ig=new Ikasgela("DW1B");
		ig.ikaselaGehitu(new Ikaslea("Ashley", 19,  new int[] {4,6,8,4,6}));
		ig.gelaIkusi();
		*/
		
		/* Ikasgela ig2=new Ikasgela("DW2B");
		ig2.ikaselaGehitu(new Ikaslea ("Alex", 20,  new int[] {6,8,8,9,3}) );
		ig2.gelaIkusi();
		*/
		
		Ikasgela ig3=new Ikasgela("SMR1");
		ig3.ikaselaGehitu(new Ikaslea ("David", 17,  new int[] {5,9,8,10,6}) );
		ig3.gelaIkusi();
		System.out.println();
		
		ig3.ikasleaBadago(new Ikaslea ("Aitor", 17,  new int[] {5,9,8,10,6}) );
		
		ig3.nota5Gutxiago();
		System.out.println();
		ig3.guztiakGainditutakoIkasleak();
		
	}
	

}
