package ud6_2zatia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;

public class Ikaslea implements Comparable <Ikaslea> {
	
	@Override
	public String toString() {
		return "Ikaslea [izena=" + izena + ", adina=" + adina + ", notak=" + Arrays.toString(notak) + "]";
	}

	private String izena;
	private int adina;
	private int [] notak;
	
	public Ikaslea(String izena, int adina, int[] notak) {
		super();
		this.izena = izena;
		this.adina = adina;
		this.notak = notak;
	}
	
	public void erakutsi()  {
		System.out.print("Izena: "+izena+", adina: "+adina+" eta bere notak:\t");
		for(int i=0; i<notak.length; i++) {
			System.out.print(notak[i]+"\t");
		}
		System.out.println();
	}
	
	
	

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}
	
	// batazbestekoa metodoa egin 
	public double batezbestekoa() {
		int batura=0;
		
		for(int i=0; i<notak.length; i++)  {
			batura=batura+notak[i];
		}
		return (double) batura/notak.length;
		
	}
	
	// equals
	@Override
	public int hashCode() {
		return Objects.hash(adina, izena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ikaslea other = (Ikaslea) obj;
		return adina == other.adina && Objects.equals(izena, other.izena);
	}
	
	// metodo bat ea guztia gaindituta duela 
	
	public boolean guztiaGaindituta() {
		
		
		for(int i=0; i<notak.length; i++) {
			if(notak[i]<5 ) {
				System.out.println(izena+ " ez du dena gaindituta");
				return false;
			}
			
		}
		
		System.out.println(izena+ " dena gaindituta");
		return true; 
	}
	/*
	@Override
	public int compareTo(Ikaslea o) {
		if(this.adina>o.adina) return 1;
		if(this.adina<o.adina) return -1;
		return 0;
	}
	*/
	
	@Override
	public int compareTo(Ikaslea o) {
		if(this.izena.compareTo(o.izena)>0) return 1;
		if(this.izena.compareTo(o.izena)<0) return -1;
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		TreeSet<Ikaslea> zerrenda=new TreeSet<Ikaslea>();
		Ikaslea ik=new Ikaslea("Asier", 22, new int[] {3,6,8,4,6});
		zerrenda.add(ik);
		zerrenda.add(new Ikaslea("Jokin", 20, new int [] {3,5,7,4,6}));
		zerrenda.add(new Ikaslea("Marta", 25, new int [] {6,6,8,6,6}));
		System.out.println(zerrenda);
	

	}

}
