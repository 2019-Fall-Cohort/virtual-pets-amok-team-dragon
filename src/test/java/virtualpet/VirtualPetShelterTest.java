package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class VirtualPetShelterTest {

	private VirtualPet dragon;
	private VirtualPetShelter underTest;
	
	@Before
	public void setup() {
	dragon = new VirtualPet("Puff");
	underTest = new VirtualPetShelter();
	
	}
	
	@Test
	public void shouldHaveShelter() {
	assertEquals(underTest.type, "something");
	}
}
