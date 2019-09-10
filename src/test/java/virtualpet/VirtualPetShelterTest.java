package virtualpet;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

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
	public void shouldBeAbleToAddPetToShelter () {
		underTest.addPetToShelter(dragon);
		
		List<VirtualPet> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, contains(dragon));
	}
	
	@Test
	public void testName() throws Exception {
		VirtualPet dragon2 = new VirtualPet("Pet2");
		VirtualPet dragon3 = new VirtualPet ("Pet3");
		
		underTest.addPetToShelter(dragon2);
		underTest.addPetToShelter(dragon3);
		
		List<VirtualPet> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, containsInAnyOrder (dragon2, dragon3));
		assertThat(addedPets, not(contains(dragon)));
		
		
	}
	
	
}
