package rechner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddieren.class, TestDividieren.class,
		TestMultiplizieren.class, TestRechner.class, TestSubtrahieren.class,
		TestTermberechnung.class, TestQuadratwurzel.class })
public class AllTests {

}
