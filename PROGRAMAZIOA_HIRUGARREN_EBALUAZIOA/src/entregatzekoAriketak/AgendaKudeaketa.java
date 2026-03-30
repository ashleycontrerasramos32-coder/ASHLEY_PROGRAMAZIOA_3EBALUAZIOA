package entregatzekoAriketak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class AgendaKudeaketa {
	
	private String PertsonakAgenda;

	public AgendaKudeaketa(String pertsonakAgenda) {
		super();
		PertsonakAgenda = pertsonakAgenda;
	}
	
	public void ikusi (String txtFitx) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("PertsonakAgenda.txt"));
		String lerroa=br.readLine();
		
		while(lerroa!=null) {
			String zatiak []=lerroa.split("	");
			String telefonoa=zatiak[0];
			int adina=Integer.parseInt(zatiak[1]);
			String izena=zatiak[2];
			String kokapena=zatiak[3];
			
			Pertsona p=new Pertsona(telefonoa, adina, izena, kokapena);
			System.out.println(telefonoa+"	"+adina+"	"+izena+"	"+kokapena);
			lerroa=br.readLine();
		}
		br.close();
		
	}
	
	public void gehituPertsona(Pertsona p) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("PertsonakAgenda.txt", true));
		bw.write(p.getTelefonoa()+"	"+p.getAdina()+"	"+p.getIzena()+"	"+p.getKokapena());
		bw.newLine();
		bw.close();
	}
	
	/* public static Pertsona eraldatu() {
		
	}
	*/

	/* public static void bilatuPertsona(String izena) {
		
	}
	*/
	
	public void gehituPertsonaKontrolatua(Pertsona p) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("PertsonakAgenda.txt"));
		String lerroa=br.readLine();
		
		while(lerroa!=null) {
			String zatiak []=lerroa.split("	");
			String telefonoa=zatiak[0];
			int adina=Integer.parseInt(zatiak[1]);
			String izena=zatiak[2];
			String kokapena=zatiak[3];
			
			Pertsona pertsonaBerdina=new Pertsona(telefonoa, adina, izena, kokapena);
			if(p.getIzena().equals(pertsonaBerdina) || p.getTelefonoa().equals(pertsonaBerdina)) {
				System.out.println(telefonoa+"	"+adina+"	"+izena+"	"+kokapena);
				lerroa=br.readLine();
			}
			else {
				System.out.println("Pertsonak berdinak dira!");
				return;
			}
		}
		br.close();
	}
	
	public void ezabatuPertsona(Pertsona p) throws IOException {
		ArrayList<Pertsona> pertsonak=new ArrayList<Pertsona>();
		
		Iterator <Pertsona> it=pertsonak.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println("Pertsona ezabatu egin da");
			pertsonak.remove(p);
		}
				
				
				
	}
	
	
	
	public static void main(String[] args) throws IOException {
		ikusi("PertsonakAgenda.txt");
		gehituPertsona(new Pertsona("611058599", 18, "Ashley", "Vitoria-Gasteiz"));
		gehituPertsonaKontrolatua(new Pertsona("611058599", 18, "Ashley", "Vitoria-Gasteiz"));
		ezabatuPertsona(new Pertsona("666555777", 25, "Juan", "Vitoria-Gasteiz"));
	}
	
	
	

}
