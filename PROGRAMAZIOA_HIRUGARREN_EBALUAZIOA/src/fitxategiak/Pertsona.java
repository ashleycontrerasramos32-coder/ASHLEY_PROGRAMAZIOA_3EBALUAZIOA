package fitxategiak;

import java.io.Serializable;
import java.util.Objects;

public class Pertsona implements Serializable {
	
	@Override
	public int hashCode() {
		return Objects.hash(izena);
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
		return Objects.equals(izena, other.izena);
	}


	private String izena;
	private String NAN;
	private int adina;
	
	
	public Pertsona(String izena, String nAN, int adina) {
		super();
		this.izena = izena;
		NAN = nAN;
		this.adina = adina;
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}


	public String getNAN() {
		return NAN;
	}


	public void setNAN(String nAN) {
		NAN = nAN;
	}


	public int getAdina() {
		return adina;
	}


	public void setAdina(int adina) {
		this.adina = adina;
	}


	@Override
	public String toString() {
		return "Pertsona [izena=" + izena + ", NAN=" + NAN + ", adina=" + adina + "]";
	} 
	
	

}
