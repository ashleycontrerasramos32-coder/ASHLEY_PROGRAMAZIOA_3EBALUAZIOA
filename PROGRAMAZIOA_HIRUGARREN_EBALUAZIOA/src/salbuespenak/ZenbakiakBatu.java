package salbuespenak;

public class ZenbakiakBatu {
	
	public static void main(String[] args) {
		
		int zenbakienBatura=0;
		int zenbatGaizki=0;
		
		for (int i=0; i<args.length; i++) {
			try {
				int zenbakia=Integer.parseInt(args[i]);
				zenbakienBatura=zenbakienBatura+zenbakia;
				
			}
			catch (NumberFormatException e) {
				System.out.println(args[i] + " ezin da gehitu");
				zenbatGaizki++;
			}
			
		}
		System.out.println("Hau da zenbakien batura: "+zenbakienBatura);
		System.out.println("Gaizki dagoen kopurua: "+zenbatGaizki);
		
		
	}

}
