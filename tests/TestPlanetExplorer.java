import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_landingposition() {
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,0,N)", planet.executeCommand("") );
	}
}
