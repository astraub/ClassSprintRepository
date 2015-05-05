package rechner;

public class Startklasse {

	public static void main(String[] args) {
		
		Rechner rechner = new Rechner();
		
		Addieren rechenmethode = new Addieren();
		
		rechner.setRechenmethode(rechenmethode);
		
		System.out.println(rechner.rechnen(1, 2));
		
		//Termberechnung
		char[] rechenzeichen = new char[]{'+','+','-'};
		
		int[] zahlen = new int[]{4,3,2,1};
		
		System.out.println(rechner.termberechnung(zahlen, rechenzeichen));
		
		
		
	}

}
