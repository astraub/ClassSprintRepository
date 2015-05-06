package rechner;

import static org.junit.Assert.assertEquals;

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
	
}
