package fitxategiak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjektuFitxategia {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//Pertsona objektuen fitxategia sortu
		/*Pertsona p1=new Pertsona("Jokin", "12345678M", 23);
		Pertsona p2=new Pertsona("Maider", "12345678M", 19);
		Pertsona p3=new Pertsona("Amaia", "12345678M", 20);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("pertsonak.obj"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.writeObject(null);
		oos.close();
		*/
		
		//Pertsona objektuen fitxategia irakurri
		//Fitxategiari pertsona gehiago gehitzeko aurrez dauden guztiak irakurri eta nonbait gorde (ArrayList)
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("pertsonak.obj"));
		ArrayList<Pertsona> zerrenda=new ArrayList<Pertsona>();
		Pertsona p=(Pertsona) ois.readObject();
		
		while(p!=null) {
			System.out.println(p.toString());
			zerrenda.add(p);
			p=(Pertsona) ois.readObject();
		}
		ois.close();
		
		//eta gero gutzi hoiek berriz fitxategian sartu eta berriak gehitu

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("pertsonak.obj"));
		for(Pertsona pe:zerrenda) {
			oos.writeObject(pe);
		}
		oos.writeObject(new Pertsona("Maitane", "47843848M", 24));
		oos.writeObject(new Pertsona("David", "6883849S", 20));
		oos.writeObject(null);
		oos.close();
		
		
		//Fitxategia berriz irakurri
		ois=new ObjectInputStream(new FileInputStream("pertsonak.obj"));
		p=(Pertsona) ois.readObject();
		
		while(p!=null) {
			System.out.println(p.toString());
			zerrenda.add(p);
			p=(Pertsona) ois.readObject();
		}

	}

}
