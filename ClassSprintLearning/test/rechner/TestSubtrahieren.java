package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubtrahieren {

	private Subtrahieren subtrahieren = new Subtrahieren();
	
	@Test
	public void testBerechnen() {
		assertEquals(3, subtrahieren.berechnen(5, 2));
		assertEquals(7, subtrahieren.berechnen(12, 5));
		assertEquals(11, subtrahieren.berechnen(17, 6));
		assertNotEquals(3, subtrahieren.berechnen(1, 1));
		assertNotEquals(7, subtrahieren.berechnen(5, 1));
		assertNotEquals(11, subtrahieren.berechnen(4, 6));
	}

}
