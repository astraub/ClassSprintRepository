package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddieren {

	private Addieren addieren = new Addieren();
	
	@Test
	public void testBerechnen() {
		assertEquals(3, addieren.berechnen(1, 2));
		assertEquals(7, addieren.berechnen(5, 2));
		assertEquals(11, addieren.berechnen(5, 6));
		assertNotEquals(3, addieren.berechnen(1, 1));
		assertNotEquals(7, addieren.berechnen(5, 1));
		assertNotEquals(11, addieren.berechnen(4, 6));
		assertNotEquals(11, addieren.berechnen(5, 5));
	}

}
