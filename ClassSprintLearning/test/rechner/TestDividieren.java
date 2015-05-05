package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDividieren {

	private Dividieren dividieren = new Dividieren();
	
	@Test
	public void testBerechnen() {
		assertEquals(3, dividieren.berechnen(6, 2));
		assertEquals(7, dividieren.berechnen(14, 2));
		assertEquals(11, dividieren.berechnen(66, 6));
		assertNotEquals(3, dividieren.berechnen(2, 1));
		assertNotEquals(7, dividieren.berechnen(5, 1));
		assertNotEquals(11, dividieren.berechnen(50, 6));
	}

}
