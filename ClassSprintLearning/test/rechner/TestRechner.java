package rechner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestRechner {

	@Mock
	Rechenmethode rechenmethode;
	
	@Mock
	Termberechnung termberechnung;
	
	@Mock
	ErweiterteRechenmethoden quadratwurzel;
	
	@InjectMocks
	private Rechner rechner;
	
	@Before
	public void setUp() throws Exception {
		rechner = new Rechner();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testInitialRechnerInstance(){
		
		rechner = new Rechner();
		
		assertEquals(null, rechner.getRechenmethode());
		assertEquals(null, rechner.getTermberechnung());
		
	}
	
	@Test
	public void testRechnen() {
		
		Mockito.when(rechner.rechnen(1, 2)).thenReturn(1 + 2);
		
		int result = rechner.rechnen(1, 2);
						
		assertEquals(3, result);
		
		//Verhaltensorientiertes Testen
		Mockito.verify(rechenmethode).berechnen(1, 2);
	}
	
	@Test
	public void testSetRechenmethode()
	{
		Rechenmethode tempMethode = new Addieren();
		Rechner tempRechner = new Rechner();
		tempRechner.setRechenmethode(tempMethode);
		assertEquals(tempMethode, tempRechner.getRechenmethode());
	}
	
	@Test
	public void testGetRechenmethode()
	{
		Rechenmethode tempMethode = new Addieren();
		Rechner tempRechner = new Rechner();
		tempRechner.setRechenmethode(tempMethode);
		assertEquals(tempMethode, tempRechner.getRechenmethode());		
	}
	
	@Test
	public void testTermberechnung(){
		
		char[] rechenzeichen = new char[]{'+','+','-'};
		int[] zahlen = new int[]{4,3,2,1};
		
		Mockito.when(rechner.termberechnung(zahlen, rechenzeichen)).thenReturn(8);
		
		assertEquals(rechner.termberechnung(zahlen, rechenzeichen), 8);
		
		//Verhaltensorientiertes Testen
		Mockito.verify(termberechnung).berechnen(zahlen, rechenzeichen);
	}
	
	@Test
	public void testSetTermberechnung()
	{
		Termberechnung tempMethode = new Termberechnung();
		Rechner tempRechner = new Rechner();
		tempRechner.setTermberechnung(tempMethode);
		assertEquals(tempMethode, tempRechner.getTermberechnung());
	}
	
	@Test
	public void testGetTermberechnung()
	{
		Termberechnung tempMethode = new Termberechnung();
		Rechner tempRechner = new Rechner();
		tempRechner.setTermberechnung(tempMethode);
		assertEquals(tempMethode, tempRechner.getTermberechnung());	
	}
	
	public void testQuadratwurzel(){
		
		Mockito.when(rechner.quadratwurzel(9)).thenReturn(3.0);
		
		assertEquals(rechner.quadratwurzel(9), 3.0, 0.1);
		
		assertNotEquals(rechner.quadratwurzel(8), 2.0, 0.1);
		
		//Verhaltensorientiertes Testen
		Mockito.verify(quadratwurzel).berechnen(9);
		
	}
	
	@Test
	public void testSetQuadratwurzel()
	{
		ErweiterteRechenmethoden tempMethode = new Quadratwurzel();
		Rechner tempRechner = new Rechner();
		tempRechner.setQuadratwurzel(tempMethode);
		assertEquals(tempMethode, tempRechner.getQuadratwurzel());
	}
	
	@Test
	public void testGetQuadratwurzel()
	{
		ErweiterteRechenmethoden tempMethode = new Quadratwurzel();
		Rechner tempRechner = new Rechner();
		tempRechner.setQuadratwurzel(tempMethode);
		assertEquals(tempMethode, tempRechner.getQuadratwurzel());	
	}
	
}
