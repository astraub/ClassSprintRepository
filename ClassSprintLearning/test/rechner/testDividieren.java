package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDividieren {

	private Dividieren dividieren = new Dividieren();
	
	@Test
	public void testBerechnen() {
		assertEquals(3, dividieren.berechnen(1, 2));
		assertEquals(7, dividieren.berechnen(5, 2));
		assertEquals(11, dividieren.berechnen(5, 6));
		assertNotEquals(3, dividieren.berechnen(1, 1));
		assertNotEquals(7, dividieren.berechnen(5, 1));
		assertNotEquals(11, dividieren.berechnen(4, 6));
	}

}
