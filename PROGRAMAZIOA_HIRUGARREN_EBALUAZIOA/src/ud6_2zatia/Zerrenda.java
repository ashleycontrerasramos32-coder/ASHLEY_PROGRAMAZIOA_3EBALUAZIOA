package ud6_2zatia;

import java.util.ArrayList;
import java.util.Iterator;

//ARIKETA 2

public class Zerrenda {
	
	private ArrayList<Punto> zerrenda=new ArrayList<Punto>();
	
	public Zerrenda() {
		zerrenda=new ArrayList<>();
	
		zerrenda.add(new Punto(-1, 2));
		zerrenda.add(new Punto(6, 4));
		zerrenda.add(new Punto(3, 6));

	}
	
	public  Zerrenda(ArrayList<Punto> zerrenda) {
		this.zerrenda=zerrenda;
	}
	
	public void bistaratu() {
		for(Punto p:zerrenda) {
			System.out.print(p.toString());
		}
	}
	
	public ArrayList<Punto> alderantzikoOrdenan() {
		ArrayList<Punto> zerrendaAlderantziz=new ArrayList<Punto>();
		
		
		for(int i=zerrenda.size()-1; i>=0;i--) {
			zerrendaAlderantziz.add(zerrenda.get(i));
		}
		return zerrendaAlderantziz;
		
	}
	
	public Punto bigarrenKoadrantea() {
		Iterator<Punto> it=zerrenda.iterator();
		while(it.hasNext()) {
			Punto pun=it.next();
			if(pun.getX()<0 && pun.getY()>0) {
				return pun;
			} 
			
		}
		return null;
		
	}
	
	public void punto00() {
		for(int i=0; i<zerrenda.size(); i++) {
			if(zerrenda.get(i).getX()==0 && zerrenda.get(i).getY()==0) {
				System.out.println("(0,0) puntuaren aurreneko posizioa hau da: "+(i+1));
				return;
			}
		}
		System.out.println("ArrayList-ak ez du (0,0)");
	}
	
	public boolean puntuaDagoAlaEz(Punto p) {
		
		if(zerrenda.contains(p)) {
			System.out.println("ArrayList (1,1) puntuan dago");
			return true;
		}
		return false;
	
	}
	
	public Punto ezabatuLaugarrenKoadrantekoPuntuak() {
		Iterator<Punto> it=zerrenda.iterator();
		while(it.hasNext()) {
			Punto pun=it.next();
			if(zerrenda.equals(pun.getX()>0 && pun.getY()<0)) {
				zerrenda.clear();
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
	Zerrenda z1=new Zerrenda();
	z1.bistaratu();

	System.out.println();
	System.out.println("Hau da zerrenda alderantzizko ordenan: "+z1.alderantzikoOrdenan());
	System.out.println();
	System.out.println("Punto bigarren koadrantean badago puntoaren baloreak itzuliko du, ez badago null itzuliko du: "+z1.bigarrenKoadrantea());
	System.out.println();
	z1.punto00();
	System.out.println();
	System.out.println(z1.puntuaDagoAlaEz(new Punto(1, 1)));
	
	}
 	
	


}
