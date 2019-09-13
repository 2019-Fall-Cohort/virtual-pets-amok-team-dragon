package virtualpet;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private Dragon dragon;
	private DragonCave underTest;
	
	@Before
	public void setup() {
	dragon = new Dragon("Puff");
	underTest = new DragonCave();
	
	}
	
	@Test
	public void shouldBeAbleToAddPetToShelter () {
		underTest.addPetToShelter(dragon);
		
		Collection<Dragon> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, contains(dragon));
	}
	
	@Test
	public void shouldBeAbleToAddMultiplePets() {
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon2);
		underTest.addPetToShelter(dragon3);
		
		Collection<Dragon> addedPets = underTest.retrievePetList();
		
		assertThat(addedPets, containsInAnyOrder (dragon2, dragon3));
		assertThat(addedPets, not(contains(dragon)));
		
	}
	
	@Test
	public void shouldNotAddDuplicatePetNames() {
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon);
		
		Collection<Dragon> petList = underTest.retrievePetList();
		
		assertThat(underTest.petList.size(), is(1));
		
	}
	
	@Test
	public void shouldBeAbleToReturnPetByName() {
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		Dragon retrievedVirtualPet = underTest.retrieveVirtualpet("Puff");
		assertThat(retrievedVirtualPet, is(dragon));

		Dragon retrievedVirtualPet2 = underTest.retrieveVirtualpet("Pet2");
		assertThat(retrievedVirtualPet2, is(dragon2));
		
	}
	@Test
	public void shouldBeAbleToTickAllPets() throws Exception {
		
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		underTest.tickAllPets();
		assertThat(dragon.getHunger(), is(11));
		assertThat(dragon2.getHunger(), is(11));
		assertThat(dragon3.getHunger(), is(11));
	}
	
	@Test
	public void shouldBeAbleToFeedAllPets() throws Exception {
		
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		underTest.feedAllPets(4);
		assertThat(dragon.getHunger(), is(5));
		assertThat(dragon2.getHunger(), is(5));
		assertThat(dragon3.getHunger(), is(5));
}
	@Test
	public void shouldBeAbleToPlayWithAllPets() throws Exception {
		
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		underTest.playWithAllPets(4);
		assertThat(dragon.getBoredom(), is(5));
		assertThat(dragon2.getBoredom(), is(5));
		assertThat(dragon3.getBoredom(), is(5));
		
}
	@Test
	public void shouldBeAbleToRestWithAllPets() throws Exception {
		
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		underTest.restAllPets(4);
		assertThat(dragon.getFatigue(), is(5));
		assertThat(dragon2.getFatigue(), is(5));
		assertThat(dragon3.getFatigue(), is(5));
		
}
	@Test
	public void shouldBeAbleToDoMagicWithAllPets() throws Exception {
		
		Dragon dragon2 = new Dragon("Pet2");
		Dragon dragon3 = new Dragon ("Pet3");
		
		underTest.addPetToShelter(dragon);
		underTest.addPetToShelter(dragon2);		
		underTest.addPetToShelter(dragon3);
		
		underTest.doMagicWithAllPets(4);
		assertThat(dragon.getMagic(), is(5));
		assertThat(dragon2.getMagic(), is(5));
		assertThat(dragon3.getMagic(), is(5));
		
}
}