package virtualpet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class OrganicFireDragonTest {	
	
	@Test
	public void shouldBeAbleToCreateOrganicFireDragon() throws Exception {
		OrganicDragon underTest = new OrganicFireDragon("Test Dragon");
		String expectedName = underTest.getName();
		assertThat(expectedName, is("Test Dragon"));
	}
	
	

}
