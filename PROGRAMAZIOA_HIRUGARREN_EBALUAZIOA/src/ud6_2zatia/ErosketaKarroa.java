package ud6_2zatia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ErosketaKarroa {
	
	//produktu bakoitzetatik zenbat erosten dugu 
	private HashMap<Item, Integer> karroa;
	
	public ErosketaKarroa() {
		// karroa sortuta, baina oraindik hutsik dago
		karroa= new HashMap<Item, Integer>();
	}
	
	//produktuak (Item eta erositako kantitatea) karrora gehitzeko metodoa
	
	public void gehituItem(Item produktua, int kopurua) {
		//karroa.put(produktua, kopurua);
		//produktua aurrez bazegoen kopuruak batu egingo ditugu(equals item klaseko equals metodoa berdefinitua)
		if(karroa.containsKey(produktua)) {
			karroa.put(produktua, karroa.get(produktua)+kopurua);
		} else {
			karroa.put(produktua, kopurua);
		}
		
	}
	//karroaren prezioTotala kalkulatu eta itzuliko duen metodoa
	public float prezioTotala() {
		float prezioa=0;
		Iterator<Item> it=karroa.keySet().iterator();
		while(it.hasNext()) {
			Item prod=it.next();
			prezioa+=prod.getPrezioa()*karroa.get(prod);
		}
		return prezioa;
		
	}
	//karroko produktu guztien izenekin sortutuako ArrayList bat itzuliko duen metodoa 
	// ArrayList sortu, gako bakoitzaren izena hartu eta erakutsi
	public ArrayList<String> produktuenIzena() {
		ArrayList<String> izenak= new ArrayList<String>();
		
		Iterator<Item> it=karroa.keySet().iterator();
		
		while(it.hasNext()) {
			izenak.add(it.next().getIzena());
		}
		return izenak;
		
	}
	//fakturaren tiketa erakutsi formatu honetan: 
	//produktuaren izena----produktuaren prezioa----unitateak----produktuaren prezio totala(lerro bakoitzeko)
	//eta amaieran karro guztiaren prezio totala
	public void faktura() {
		
		Iterator<Item> it=karroa.keySet().iterator();
		
		
		
		while(it.hasNext()) {
			Item prod=it.next();
			System.out.println(prod.getIzena()+"----"+prod.getPrezioa()+"----"+karroa.get(prod)+"----"+prod.getPrezioa()*karroa.get(prod));
		}
		System.out.println("Hau da karro guztiaren prezio totala: "+prezioTotala());
		
		
	}
	//karroa zeharkatu eta akumulatu produktu edo item bakoitzetik zenbat unitate erosi diren eta bukarean batura hori gehitu
	//karroan guztira zenbat unitate erosi diren itzuliko duen metodoa
	public int unitateakGuztira() {
		int batura=0;
		
		//BUKLE QUE SOLO RECORRE LOS VALORES 
		Iterator<Integer> it=karroa.values().iterator();
		while(it.hasNext()) {
			batura+=it.next();
		}
		return batura;
	}
	
	
	
	public static void main(String[] args) {
		ErosketaKarroa ek=new ErosketaKarroa();
		ek.gehituItem(new Item("Tomatea", 1.7f), 7);
		ek.gehituItem(new Item("Arroza", 2), 4);
		ek.gehituItem(new Item("Arroza", 2), 3);
		ek.gehituItem(new Item("Kafe", 2), 1);
		System.out.println("Hauek dira karroen produktuak: "+ek.karroa);
		System.out.println();
		System.out.println("Hau da produktuen prezio totala: "+ek.prezioTotala());
		System.out.println();
		System.out.println("Hauek dira produktuen izenak: "+ek.produktuenIzena());
		System.out.println();
		ek.faktura();
		System.out.println("Unitateak: "+ek.unitateakGuztira());
		
	}
	
	
}
