package ud6_2zatia;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapak {
	
	public static void mapaIkusi(Map<String, Integer> mapa) {
		Iterator <String> it=mapa.keySet().iterator();
		while(it.hasNext()) {
			String hitza=it.next();
			System.out.println(hitza+": "+mapa.get(hitza));
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> mapa1=new HashMap<String, Integer>();
		mapa1.put("H", 9);
		mapa1.put("Z", 2);
		mapa1.put("B", 6);
		mapa1.put("L", 5);
		mapaIkusi(mapa1);
		System.out.println("-----------");
		LinkedHashMap<String, Integer> mapa2=new LinkedHashMap<String, Integer>();
		mapa2.put("H", 9);
		mapa2.put("Z", 2);
		mapa2.put("B", 6);
		mapa2.put("L", 5);
		mapaIkusi(mapa2);
		System.out.println("-----------");
		TreeMap<String, Integer> mapa3=new TreeMap<String, Integer>();
		mapa3.put("H", 9);
		mapa3.put("Z", 2);
		mapa3.put("B", 6);
		mapa3.put("L", 5);
		mapaIkusi(mapa3);
		System.out.println("-----------");
		Iterator<Integer> it1=mapa1.values().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

		

		
	}

}
