package UD7;

import java.util.Objects;

public class Pertsona {
	
	String nan;
	String izena;
	int adina;
	
	public Pertsona(String nan, String izena, int adina) { // KONSTRUKTOREA ATRIBUTUEKIN
		//super();
		this.nan = nan;
		this.izena = izena;
		this.adina = adina;
	}
	
	public Pertsona() { // KONSTRUKTOREA HUTSIK
		//super();
	}

	@Override
	public String toString() { //toString metodoa
		return "Pertsona [nan=" + nan + ", izena=" + izena + ", adina=" + adina + "]";
	}

	public void erakutsi() {
		System.out.println("Izena: "+izena+" adina: "+adina+" eta nan zenbakia: "+nan);
	}
	public static void main(String[] args) {
		
		Pertsona p1=new Pertsona("689686896X","Asier",16);
		p1.erakutsi();
		System.out.println(p1.toString());
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	@Override // SORUCE, HASHCODE
	public int hashCode() {
		return Objects.hash(nan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertsona other = (Pertsona) obj;
		return Objects.equals(nan, other.nan);
	}
	
	

}
