package ud6_2zatia;

import java.util.Comparator;

public class KonparatuRankingBitartez implements Comparator <Jokalaria> {

	@Override
	public int compare(Jokalaria o1, Jokalaria o2) {
		if(o1.getRanking()>o2.getRanking()) return 1;
		if(o1.getRanking()<o2.getRanking()) return -1;
		return 0;
	}
	

}
