package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuadratwurzel {
	
	@Test
	public void testBerechnen() {

		ErweiterteRechenmethoden quadratwurzel = new Quadratwurzel();
		
		assertEquals(quadratwurzel.berechnen(9), 3.0, 0.1);
		
		assertEquals(quadratwurzel.berechnen(4), 2.0, 0.1);
		
		assertNotEquals(quadratwurzel.berechnen(8), 2.0, 0.1);
		
	}

}
