package salbuespenak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SalbuespenFrogakPuntuekin {
	
	//Fitxategiko lerro bakoitzetik puntu bat sortzen saiatu (NumberFormatException)(ezin bada null bezala gorde)
	//Array-aren tamaiana kontrolpean izan behar dugu(ArrayIndexOutofBounds)
	public static int fitxategitikArrayra(String fitxIzena, Puntua [] arr) {
		int n=0;
		try(BufferedReader br=new BufferedReader(new FileReader(fitxIzena))) {
			String lerroa=br.readLine();
			while(lerroa!=null) {
				String [] zatiak=lerroa.split(",");
				Puntua p=null;
				//click derecho en las lineas y surrounded with..
				try {
					int x=Integer.parseInt(zatiak[0]);
					int y=Integer.parseInt(zatiak[1]);
					p=new Puntua(x, y);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("Ezin izan da puntua sortu, irakurritako baloreren batekin arazoak");
				} catch (PuntuaRangozKanpoSalbuespena e) {
					System.out.println(e.getMessage());
				} 
				
				finally {
					arr[n]=p;
					n++;
				}
				lerroa=br.readLine();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arraya beteta. Ezin dira puntu gehiago sartu");
		}
		return n;
	}
	
	//Array ikusteko metodoa, NullPointerException kontrolatuz
	public static void puntuenArrayaIkusi(Puntua[] arr, int n) {
		for(int i=0; i<n; i++) {
			try {
				System.out.println(arr[i].toString());
			} catch (NullPointerException e) {
				System.out.println("Puntu nulua");
			}
		}
	}
	
	public static int bigarrenKoadrantekoakFitxategira(String fitxizena, Puntua[] arr, int n) {
		int kont=0;
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fitxizena))) {
			for(int i=0; i<n; i++) {
					try {
						if(arr[i].getX()<0 && arr[i].getY()>0) {
							oos.writeObject(arr[i]);
							kont++;
						}	
					} catch (NullPointerException e) {
						System.out.println("Puntua nulua, ezin da ezer koadrantean dagoen");
					}
			}
			oos.writeObject(null);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kont;
	}
	public static void main(String[] args) {
		Puntua [] arr=new Puntua[10];
		int n=fitxategitikArrayra("puntuak.txt",arr);
		puntuenArrayaIkusi(arr, n);
		System.out.println(bigarrenKoadrantekoakFitxategira("puntuak.obj", arr, n));
	}
	
	

}
