package ud6_2zatia;

import java.util.HashSet;

public class Platerra {
	
	private String platerraIzena;
	
	private HashSet<Osagai> osagaiakPlaterra=new HashSet<Osagai>();

	public Platerra(String platerraIzena, HashSet<Osagai> osagaiakPlaterra) {
		super();
		this.platerraIzena = platerraIzena;
		this.osagaiakPlaterra = osagaiakPlaterra;
	}

	@Override
	public String toString() {
		return "Platerra [platerraIzena=" + platerraIzena + ", osagaiakPlaterra=" + osagaiakPlaterra + "]";
	}

	public String getPlaterraIzena() {
		return platerraIzena;
	}

	public HashSet<Osagai> getOsagaiakPlaterra() {
		return osagaiakPlaterra;
	}
	
	

}
