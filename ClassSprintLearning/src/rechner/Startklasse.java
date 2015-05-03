package rechner;

public class Startklasse {

	public static void main(String[] args) {
		
		Rechner rechner = new Rechner();
		
		Addieren rechenmethode = new Addieren();
		
		rechner.setRechenmethode(rechenmethode);
		
		System.out.println(rechner.rechnen(1, 2));
		
	}

}
