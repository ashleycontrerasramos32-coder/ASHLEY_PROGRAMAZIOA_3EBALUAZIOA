package ud6_2zatia;

import java.util.ArrayList;
import java.util.Iterator;

//ARIKETA 2

public class Sorta1_Ariketa2 {
	
	private ArrayList<Punto> zerrenda=new ArrayList<Punto>();
	
	public Sorta1_Ariketa2() {
		zerrenda=new ArrayList<>();
	
		zerrenda.add(new Punto(-1, 2));
		zerrenda.add(new Punto(1, 1));
		zerrenda.add(new Punto(3, -6));
		zerrenda.add(new Punto(9, 9));

	}
	
	public  Sorta1_Ariketa2(ArrayList<Punto> zerrenda) {
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
	
	public boolean puntua11Badago() {
		
		return zerrenda.contains(new Punto(1,1));
	
	}
	public void distantzia10Ezabatu() {
		for(int i=0; i<zerrenda.size();i++) {
			Punto p=zerrenda.get(i);
			if(Math.sqrt(p.getX()*p.getX()+p.getY()*p.getY())>10) {
				zerrenda.remove(p);
				return;
			}
		}
	}
	
	public void ezabatuLaugarrenKoadrantekoPuntuak() {
		Iterator<Punto> it=zerrenda.iterator();
		while(it.hasNext()) {
			Punto pun=it.next();
			if(pun.getX()>0 && pun.getY()<0) it.remove();
		}
	}
	
	
	public static void main(String[] args) {
		
	Sorta1_Ariketa2 z1=new Sorta1_Ariketa2();
	z1.bistaratu();
	System.out.println();
	System.out.println("Hau da zerrenda alderantzizko ordenan: "+z1.alderantzikoOrdenan());
	System.out.println();
	System.out.println("Punto bigarren koadrantean badago puntoaren baloreak itzuliko du, ez badago null itzuliko du: "+z1.bigarrenKoadrantea());
	System.out.println();
	z1.punto00();
	System.out.println();
	System.out.println(z1.puntua11Badago());
	System.out.println();
	z1.distantzia10Ezabatu();
	System.out.println(z1.zerrenda);
	System.out.println();
	z1.ezabatuLaugarrenKoadrantekoPuntuak();
	System.out.println(z1.zerrenda);
	}
 	
	


}
