package virtualpet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RoboticIceDragonTest {

	@Test
	public void shouldBeAbleToCreateRoboticIceDragon() throws Exception {
		RoboticDragon underTest = new RoboticIceDragon("Test Dragon");
		String expectedName = underTest.getName();
		assertThat(expectedName, is("Test Dragon"));
	}

}
