package virtualpet;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
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
		
		Collection<VirtualPet> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, contains(dragon));
	}
	
	@Test
	public void shouldBeAbleToAddMultiplePets() {
		VirtualPet dragon2 = new VirtualPet("Pet2");
		VirtualPet dragon3 = new VirtualPet ("Pet3");
		
		underTest.addPetToShelter(dragon2);
		underTest.addPetToShelter(dragon3);
		
		Collection<VirtualPet> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, containsInAnyOrder (dragon2, dragon3));
		assertThat(addedPets, not(contains(dragon)));
		
	}
	
	@Test
	public void shouldNotAddDuplicatePetNames() {
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon);
		
		Collection<VirtualPet> petList = underTest.retrievePetList();
		
		assertThat(underTest.petList.size(), is(1));
		
	}
	
	@Test
	public void shouldBeAbleToReturnPetByName() {
		VirtualPet dragon2 = new VirtualPet("Pet2");
		VirtualPet dragon3 = new VirtualPet ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		VirtualPet retrievedVirtualPet = underTest.retrieveVirtualpet("Puff");
		assertThat(retrievedVirtualPet, is(dragon));

		VirtualPet retrievedVirtualPet2 = underTest.retrieveVirtualpet("Pet2");
		assertThat(retrievedVirtualPet2, is(dragon2));
		
	}
	
	
}
