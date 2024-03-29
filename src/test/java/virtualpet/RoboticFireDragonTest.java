package virtualpet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RoboticFireDragonTest {

	@Test
	public void shouldBeAbleToCreateRoboticIceDragon() throws Exception {
		RoboticDragon underTest = new RoboticFireDragon("Test Dragon");
		String expectedName = underTest.getName();
		assertThat(expectedName, is("Test Dragon"));
	}

	@Test
	public void shouldBeAbleToBreathFire() throws Exception {
		RoboticFireDragon underTest = new RoboticFireDragon("Test Dragon");
		underTest.breathFire(4);
		int expected = underTest.getMagic();
		assertEquals(expected, 6);
	}
}
