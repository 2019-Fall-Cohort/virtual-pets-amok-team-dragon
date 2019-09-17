package virtualpet;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrganicDragonTest {
	@Test
	public void shouldBeAbleToCreateOrganicDragon() {

		Dragon underTest = new OrganicDragon("Test Dragon");
		String expected = underTest.getName();
		assertThat(expected, is("Test Dragon"));
	}
	
	@Test
	public void shouldBeAbleToFeedPet() {
		OrganicDragon underTest = new OrganicDragon("Test Dragon");
		underTest.feedDragon(2);
		int expected = underTest.getHunger();
		assertEquals(expected, 8);
	}
	@Test
	public void shouldBeAbleToSleep() {
		OrganicDragon underTest = new OrganicDragon("Test Dragon");
		underTest.restDragon(7);
		int expected = underTest.getFatigue();
		assertEquals(expected, 3);
	}

}