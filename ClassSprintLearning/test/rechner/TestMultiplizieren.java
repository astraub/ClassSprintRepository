package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplizieren {

	private Multiplizieren multiplizieren = new Multiplizieren();
	
	@Test
	public void testBerechnen() {
		assertEquals(3, multiplizieren.berechnen(1, 3));
		assertEquals(8, multiplizieren.berechnen(4, 2));
		assertEquals(11, multiplizieren.berechnen(1, 11));
		assertNotEquals(3, multiplizieren.berechnen(1, 1));
		assertNotEquals(7, multiplizieren.berechnen(5, 1));
		assertNotEquals(11, multiplizieren.berechnen(4, 6));
	}

}
