package rechner;

public class Rechner {

	private Rechenmethode rechenmethode;

	public Rechner(){
		
	}
	
	public Rechner(Rechenmethode rechenmethode) {
		super();
		this.rechenmethode = rechenmethode;
	}
	
	public int rechnen(int zahl1, int zahl2)
	{
		return rechenmethode.berechnen(zahl1, zahl2);
	}

	public Rechenmethode getRechenmethode() {
		return rechenmethode;
	}

	public void setRechenmethode(Rechenmethode rechenmethode) {
		this.rechenmethode = rechenmethode;
	}
	
	public int termberechnung(int[] zahlen, char[] rechenzeichen)
	{
		return Termberechnung.berechnen(zahlen, rechenzeichen);
	}
	
}
