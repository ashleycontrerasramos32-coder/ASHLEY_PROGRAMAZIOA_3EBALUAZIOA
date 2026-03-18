package fitxategiak;

import java.io.Serializable;

public class Pertsona implements Serializable {
	
	private String izena;
	private String NAN;
	private int adina;
	
	
	public Pertsona(String izena, String nAN, int adina) {
		super();
		this.izena = izena;
		NAN = nAN;
		this.adina = adina;
	}


	@Override
	public String toString() {
		return "Pertsona [izena=" + izena + ", NAN=" + NAN + ", adina=" + adina + "]";
	} 
	
	

}
