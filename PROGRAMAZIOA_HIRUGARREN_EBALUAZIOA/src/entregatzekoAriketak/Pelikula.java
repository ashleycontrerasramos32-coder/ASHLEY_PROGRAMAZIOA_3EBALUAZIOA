package entregatzekoAriketak;

public class Pelikula {
	
	private String izena;
	
	private int iraupena; //minututan
	
	private int urtea;

	@Override
	public String toString() {
		return "Pelikula [izena=" + izena + ", iraupena(minututan)=" + iraupena/60 + ", urtea=" + urtea + "]";
	}
	
	public boolean berdinaDa(Pelikula bestea) {
		if(izena.equals(bestea.izena) && this.urtea==bestea.urtea && ((this.iraupena+bestea.iraupena)<=5)) {
			System.out.println("Pelikulak berdinak dira");
			return true;
		}
		System.out.println("Pelikulak ez dira berdinak");
		return false;
	}
	
	
	
	

}
