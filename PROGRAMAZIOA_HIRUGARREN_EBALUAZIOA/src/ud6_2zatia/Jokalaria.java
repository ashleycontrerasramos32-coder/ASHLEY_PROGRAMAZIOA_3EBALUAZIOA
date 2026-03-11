package ud6_2zatia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Jokalaria implements Comparable <Jokalaria>{
	
	private String izena;
	private int adina;
	private int ranking;
	public Jokalaria(String izena, int adina, int ranking) {
		super();
		this.izena = izena;
		this.adina = adina;
		this.ranking = ranking;
	}
	
	@Override
	public int compareTo(Jokalaria o) {
		if(this.adina>o.adina) return 1;
		if(this.adina<o.adina) return -1;
		return 0;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Jokalaria> zerrenda=new ArrayList<Jokalaria>();
		zerrenda.add(new Jokalaria("Mikel", 21, 15));
		zerrenda.add(new Jokalaria("Maria", 19, 33));
		zerrenda.add(new Jokalaria("Xabier",25 , 0));
		System.out.println(zerrenda);
		Collections.sort(zerrenda);
		System.out.println(zerrenda);
		
		KonparatuRankingBitartez krb=new KonparatuRankingBitartez();
		Collections.sort(zerrenda,krb);
		System.out.println(zerrenda);
		
		TreeSet<Jokalaria> zerrenda2=new TreeSet<Jokalaria>(krb);
		zerrenda2.add(new Jokalaria("Mikel", 21, 15));
		zerrenda2.add(new Jokalaria("Maria", 19, 33));
		zerrenda2.add(new Jokalaria("Xabier",25 , 0));
		System.out.println(zerrenda2);

	}

	@Override
	public String toString() {
		return "Jokalaria [izena=" + izena + ", adina=" + adina + ", ranking=" + ranking + "]";
	}

	public int getRanking() {
		return ranking;
	}

}
