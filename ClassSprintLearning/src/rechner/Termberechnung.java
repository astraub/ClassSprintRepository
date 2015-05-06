package rechner;

public class Termberechnung {

	public int berechnen(int[] zahlen, char[] rechenzeichen) {

		int result = zahlen[0];
		
		for (int i = 1; i < zahlen.length; i++) {
			switch (rechenzeichen[i-1]) {
			case '+': result = result + zahlen[i];
				
				break;
			case '-': result = result - zahlen[i];
			default:
				break;
			}
		}
		return result;
	}	
	
}
