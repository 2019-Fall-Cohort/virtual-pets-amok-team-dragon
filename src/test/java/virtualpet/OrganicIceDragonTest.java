package virtualpet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class OrganicIceDragonTest {

	@Test
	public void shouldBeAbleToCreateOrganicIceDragon() throws Exception {
		OrganicDragon underTest = new OrganicIceDragon("Test Dragon");
		String expectedName = underTest.getName();
		assertThat(expectedName, is("Test Dragon"));
	}

}
