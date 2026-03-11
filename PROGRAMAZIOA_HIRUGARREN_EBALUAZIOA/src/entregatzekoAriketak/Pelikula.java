package entregatzekoAriketak;

import java.util.Objects;

public class Pelikula {
	
	private String izena;
	
	private int iraupena; //minututan
	
	private int urtea;

	@Override
	public String toString() {
		return "Pelikula [izena=" + izena + ", iraupena=" + iraupena/60 + " ordu " + iraupena%60+ " minutu" + ", urtea=" + urtea + "]";
	}
	
	public boolean berdinaDa(Pelikula bestea) {
		if(izena.equals(bestea.izena) && this.urtea==bestea.urtea && ((this.iraupena+bestea.iraupena)<=5)) {
			System.out.println("Pelikulak berdinak dira");
			return true;
		}
		System.out.println("Pelikulak ez dira berdinak");
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(iraupena, izena, urtea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelikula other = (Pelikula) obj;
		return iraupena == other.iraupena && Objects.equals(izena, other.izena) && urtea == other.urtea;
	}
	
	
	
	
	
	

}
