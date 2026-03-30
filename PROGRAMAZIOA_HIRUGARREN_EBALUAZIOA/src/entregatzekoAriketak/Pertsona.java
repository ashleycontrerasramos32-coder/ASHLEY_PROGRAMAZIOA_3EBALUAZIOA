package entregatzekoAriketak;

public class Pertsona {
	
	private String izena;
	
	private int adina;
	
	private String telefonoa;
	
	private String kokapena;

	public Pertsona(String telefonoa, int adina, String izena, String kokapena) {
		super();
		this.telefonoa = telefonoa;
		this.adina = adina;
		this.izena = izena;
		this.kokapena = kokapena;
	}

	@Override
	public String toString() {
		return "Pertsona [izena=" + izena + ", adina=" + adina + ", telefonoa=" + telefonoa + ", kokapena=" + kokapena
				+ "]";
	}

	public String getIzena() {
		return izena;
	}

	public int getAdina() {
		return adina;
	}

	public String getTelefonoa() {
		return telefonoa;
	}

	public String getKokapena() {
		return kokapena;
	} 
	
	

}
