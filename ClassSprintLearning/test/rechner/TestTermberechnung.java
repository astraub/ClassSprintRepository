package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTermberechnung {

	@Test
	public void testTermberechnung(){
		
		char[] rechenzeichen = new char[]{'+','+','-'};
		int[] zahlen = new int[]{4,3,2,1};
		
		assertEquals(8, Termberechnung.berechnen(zahlen, rechenzeichen));
	}

}
