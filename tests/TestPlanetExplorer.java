import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_landingposition() {
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,0,N)", planet.executeCommand("") );
	}
	@Test
	public void test_moveforward(){
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,1,N)", planet.executeCommand("f"));
	}
	@Test
	public void test_movebackward(){
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,-1,N)", planet.executeCommand("b"));
	}
	@Test
	public void test_turnleft(){
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,0,W)", planet.executeCommand("l"));
	}
	@Test
	public void test_turnright(){
		PlanetExplorer planet = new PlanetExplorer(100, 100, "");
		assertEquals("(0,0,E)", planet.executeCommand("r"));
	}
}
