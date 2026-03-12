package entregatzekoAriketak;

import java.util.ArrayList;
import java.util.Iterator;

public class Zinema {
		
		private String zinemarenIzena;
		
		private ArrayList<Pelikula> filmak;
		
		private Pelikula [] salak;

		public Zinema(String zinemarenIzena, int salaKop) {
			this.zinemarenIzena=zinemarenIzena;
			this.filmak=new ArrayList<>();
			this.salak=new Pelikula[salaKop];
		}
		
		public int salaPeli(String izena, int iraupena, int urtea, Pelikula p) {
			for(int i=0; i<salak.length; i++) {
				if(salak[i]!=null && salak[i].berdinaDa(p)) {
					return i+1;
				}
			}
			return -1;
		}
		
		public void gehituPelikula(Pelikula p) {
			
			for(Pelikula pel:filmak) {
				if(pel.berdinaDa(p)) {
					System.out.println("Pelikula zineman dago");
					return;
				}
			}
			
			for(int i=0; i<salak.length; i++) {
				if(salak[i]!=null) {
					salak[i]=p;
					filmak.add(p);
					System.out.println("Salak dagoenez, pelikulak gehituko dira ");
					return;
				}	
			}
			
			System.out.println("Ezin da pelikula gehitu");
		}
		
		public void gehituPelikula2(Pelikula p, int salaZenbakia) {
			
			if(salaZenbakia>salak.length && salaZenbakia<0) {
				System.out.println("Sala hori ez da existitzen");
				return;
			}
			
			for(Pelikula pel:filmak) {
				if(pel.berdinaDa(p)) {
					System.out.println("Pelikula hori zineman dago");
				}
			}
			
			if(salak[salaZenbakia-1]!=null) {
				System.out.println("Sala okupatuta dago");
				return;
			}
			salak[salaZenbakia-1]=p;
			filmak.add(p);
			
		}
		
		public void ikusi () {
			
			System.out.println(zinemarenIzena);
			
			for(int i=0; i<salak.length; i++) {
				if(salak[i]!=null) {
					System.out.println(salak[i].getIzena()+"------"+(i+1)+". sala");
				}
			}
		}
		
		public void kenduPelikula(String kateaBerdina) {
			for(int i=0; i<salak.length; i++) {
				if(salak[i].getIzena().startsWith(kateaBerdina)) {
					filmak.remove(i);
					System.out.println("Zinemako filmak kate horrekin hasten dira, horregatik pelikula kenduko da");
				}
			}
			System.out.println("Zinemako filmak ez dira hasten kate horrekin, horregatik mantenduko da pelikula");
		}
		
		public ArrayList <Integer> libre() {
			ArrayList<Integer> salaZenbakiakLibre=new ArrayList<Integer>();
			for(int i=0; i<salak.length; i++) {
				if(salak[i]==null) {
					System.out.println("Hau da libre dagoen salaren zenbakia: "+salaZenbakiakLibre.add(i+1));
				}
			}
			return salaZenbakiakLibre;
		}
		
		/*
		public void salazAldatu(Pelikula p) {
			for(int i=0; i<filmak.size(); i++) {
				
			}
		}
		*/
		
		public void zinemaReseteatu() {
			
			filmak.clear();
			for(int i=0; i<salak.length; i++) {
				salak[i]=null;
				System.out.println("Zinema erreseteatu da");

			}
		}
		
		public void pelikulaLaburrenak(int minutuak) {
			ArrayList<String> pelikulakIzenak=new ArrayList<String>();
			
			for(Pelikula p:filmak) {
				if(p.getIraupena()<minutuak) {
					pelikulakIzenak.add(p.getIzena());
				}
			}
			System.out.println(pelikulakIzenak);
		}
		
		
		
		
	
		
			


}
