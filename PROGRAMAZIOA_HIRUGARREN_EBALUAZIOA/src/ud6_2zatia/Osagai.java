package ud6_2zatia;

public class Osagai {
	
	private String osagaiarenIzena;
	
	private int kaloriaKopurua;

	public Osagai(String osagaiarenIzena, int kaloriaKopurua) {
		super();
		this.osagaiarenIzena = osagaiarenIzena;
		this.kaloriaKopurua = kaloriaKopurua;
	}

	@Override
	public String toString() {
		return "Osagai [osagaiarenIzena=" + osagaiarenIzena + ", kaloriaKopurua=" + kaloriaKopurua + "]";
	}

	public String getOsagaiarenIzena() {
		return osagaiarenIzena;
	}

	public int getKaloriaKopurua() {
		return kaloriaKopurua;
	}
	
	
	
	

}
