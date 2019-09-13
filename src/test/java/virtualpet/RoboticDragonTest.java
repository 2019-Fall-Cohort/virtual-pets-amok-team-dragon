package virtualpet;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class RoboticDragonTest {
	@Test
	public void shouldBeAbleToCreateRoboticDragon() {
	
	Dragon underTest = new RoboticDragon("Test Dragon");
	String expected = underTest.getName();
	assertThat(expected, is("Test Dragon"));
	
	}
}


