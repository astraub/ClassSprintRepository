package rechner;

public class Rechner {

	private Rechenmethode rechenmethode;
	private Termberechnung termberechnung;
	private ErweiterteRechenmethoden quadratwurzel;

	public Rechner(){
		
	}
	
	public Rechner(Rechenmethode rechenmethode, Termberechnung termberechnung, ErweiterteRechenmethoden quadratwurzel) {
		super();
		this.rechenmethode = rechenmethode;
		this.termberechnung = termberechnung;
		this.quadratwurzel = quadratwurzel;
	}
	
	public Rechner(Rechenmethode rechenmethode, Termberechnung termberechnung) {
		super();
		this.rechenmethode = rechenmethode;
		this.termberechnung = termberechnung;
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
		return termberechnung.berechnen(zahlen, rechenzeichen);
	}

	public Termberechnung getTermberechnung() {
		return termberechnung;
	}

	public void setTermberechnung(Termberechnung termberechnung) {
		this.termberechnung = termberechnung;
	}
	
	public double quadratwurzel(int zahl){
		return quadratwurzel.berechnen(zahl);
	}

	public ErweiterteRechenmethoden getQuadratwurzel() {
		return quadratwurzel;
	}

	public void setQuadratwurzel(ErweiterteRechenmethoden quadratwurzel) {
		this.quadratwurzel = quadratwurzel;
	}

}
