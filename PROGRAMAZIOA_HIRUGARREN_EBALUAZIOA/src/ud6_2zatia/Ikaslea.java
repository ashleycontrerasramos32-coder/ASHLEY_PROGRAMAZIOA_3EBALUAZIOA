package ud6_2zatia;

import java.util.Objects;

public class Ikaslea {
	
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
	
	public static void main(String[] args) {
		Ikaslea ika=new Ikaslea("Asier", 22, new int[] {3,6,8,4,6});
		ika.erakutsi();
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
				System.out.println("Ez du dena gaindituta");
				return false;
			}
			
		}
		
		System.out.println("Dena gaindituta");
		return true; 
	}

	
	
	

}
