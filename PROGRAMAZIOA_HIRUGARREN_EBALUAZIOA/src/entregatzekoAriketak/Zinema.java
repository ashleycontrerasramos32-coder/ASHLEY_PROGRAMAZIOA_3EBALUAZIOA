package entregatzekoAriketak;

import java.util.ArrayList;

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
				if(salak[i]!=null && salak[i].equals(p)) {
					return i+1;
				}
			}
			return -1;
		}
		
		public void gehituPelikula(Pelikula p) {
			
			for(int i=0; i<filmak.size(); i++) {
				if(filmak.contains(p)) {
					System.out.println("Pelikula zineman dago");
					return;
				}
			}

			
			
			for(int i=0; i<salak.length; i++) {
				if(salak[i]!=null) {
					
					System.out.println("Gehitu nahi duzun sala okupatuta dago");
				}	
			}
			
			System.out.println("Ezin da pelikula gehitu");
		}
		
		public void gehituPelikula(Pelikula p, ) {
			
			
			
			
			System.out.println("Ezin da pelikula gehitu");
		}
			

			


}
