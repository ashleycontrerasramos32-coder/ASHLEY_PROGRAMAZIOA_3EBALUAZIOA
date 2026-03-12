package entregatzekoAriketak;

import java.util.ArrayList;

public class Nagusia {
	
	public static void main(String[] args) {
		Zinema z1=new Zinema("YelmoCines", 14);
		Pelikula p1=new Pelikula();
		Pelikula p2=new Pelikula();
		Pelikula p3=new Pelikula();
		Pelikula p4=new Pelikula();

		z1.salaPeli("8 apellidos vascos", 120, 2023, p1);
		z1.salaPeli("8 apellidos vascos", 122, 2023, p2);
		z1.salaPeli("La infiltrada", 130, 2020, p3);
		z1.salaPeli("Historia de un matrimonio", 110, 2021, p4);

		//GEHITU PELIKULA METODOA
		System.out.println();
		z1.gehituPelikula(p1);
		System.out.println();
		z1.gehituPelikula(p2);
		System.out.println();
		
		//GEHITU PELIKULA2 METODOA
		z1.gehituPelikula2(p1, 2);
		System.out.println();
		z1.gehituPelikula2(p2, 2);
		System.out.println();
		
		

		
		
		
		
	}

}
