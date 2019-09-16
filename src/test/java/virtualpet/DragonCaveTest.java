package virtualpet;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DragonCaveTest {
@Test
public void shouldBeAbleToAddOrganicAndRobiticDragons() {
	Dragon underTestOrganic = new OrganicDragon("TestOrganic");
	Dragon underTestRobotic = new RoboticDragon("TestRobotic");
	DragonCave underTestCave= new DragonCave();
	underTestCave.addPetToShelter(underTestRobotic);
	underTestCave.addPetToShelter(underTestOrganic); 
	Collection<Dragon> addedPets = underTestCave.retrievePetList();
	assertThat(addedPets, containsInAnyOrder(underTestRobotic , underTestOrganic));
}

	
	@Test
	public void shouldNotAddDuplicatePetNames() {
		Dragon underTestOrganic = new OrganicDragon("Bob");
		Dragon underTestRobotic = new RoboticDragon("Bob");
		DragonCave underTestCave= new DragonCave();
		underTestCave.addPetToShelter(underTestRobotic);
		underTestCave.addPetToShelter(underTestOrganic); 
		Collection<Dragon> addedPets = underTestCave.retrievePetList();
		
		assertThat(underTestCave.petList.size(), is(1));
		
	}
	
	@Test
	public void shouldBeAbleToReturnPetByName() { 
	Dragon underTestOrganic = new OrganicDragon("TestOrganic");
	Dragon underTestRobotic = new RoboticDragon("TestRobotic");
	DragonCave underTestCave= new DragonCave();
	underTestCave.addPetToShelter(underTestRobotic);
	underTestCave.addPetToShelter(underTestOrganic); 
	Dragon retrieved = underTestCave.retrieveVirtualpet("TestOrganic");
		assertThat(retrieved, is(underTestOrganic));

		Dragon retrievedVirtualPet2 = underTestCave.retrieveVirtualpet("TestRobotic");
		assertThat(retrievedVirtualPet2, is(underTestRobotic)); } 
//		
//	}
//	@Test
//	public void shouldBeAbleToTickAllPets() throws Exception {
//		
//		Dragon dragon2 = new RoboticDragon("Pet2");
//		Dragon dragon3 = new Dragon ("Pet3");'
//		
//		underTest.addPetToShelter(dragon);
//		underTest.addPetToShelter(dragon2);		
//		underTest.addPetToShelter(dragon3);
//		
//		underTest.tickAllPets();
//		assertThat(dragon.getHunger(), is(11));
//		assertThat(dragon2.getHunger(), is(11));
//		assertThat(dragon3.getHunger(), is(11));
//	}
	
//	@Test
//	public void shouldBeAbleToFeedAllPets() throws Exception {
//		
//		Dragon dragon2 = new Dragon("Pet2");
//		Dragon dragon3 = new Dragon ("Pet3");
//		
//		underTest.addPetToShelter(dragon);
//		underTest.addPetToShelter(dragon2);		
//		underTest.addPetToShelter(dragon3);
//		
//		underTest.feedAllPets(4);
//		assertThat(dragon.getHunger(), is(5));
//		assertThat(dragon2.getHunger(), is(5));
//		assertThat(dragon3.getHunger(), is(5));
//}
	@Test
	public void shouldBeAbleToPlayWithAllPets() throws Exception {
		
		Dragon underTestOrganic = new OrganicDragon("TestOrganic");
		Dragon underTestRobotic = new RoboticDragon("TestRobotic");
		DragonCave underTestCave= new DragonCave();
		underTestCave.addPetToShelter(underTestRobotic);
		underTestCave.addPetToShelter(underTestOrganic); 
		
		underTestCave.playWithAllPets(4);
		assertThat(underTestRobotic.getBoredom(), is(6));
		assertThat(underTestOrganic.getBoredom(), is(6));
		
		
}
//	@Test
//	public void shouldBeAbleToRestWithAllPets() throws Exception {
//		
//		Dragon dragon2 = new Dragon("Pet2");
//		Dragon dragon3 = new Dragon ("Pet3");
//		
//		underTest.addPetToShelter(dragon);
//		underTest.addPetToShelter(dragon2);		
//		underTest.addPetToShelter(dragon3);
//		
//		underTest.restAllPets(4);
//		assertThat(dragon.getFatigue(), is(5));
//		assertThat(dragon2.getFatigue(), is(5));
//		assertThat(dragon3.getFatigue(), is(5));
//		
//}
//	@Test
//	public void shouldBeAbleToDoMagicWithAllPets() throws Exception {
//		
//		Dragon dragon2 = new Dragon("Pet2");
//		Dragon dragon3 = new Dragon ("Pet3");
//		
//		underTest.addPetToShelter(dragon);
//		underTest.addPetToShelter(dragon2);		
//		underTest.addPetToShelter(dragon3);
//		
//		underTest.doMagicWithAllPets(4);
//		assertThat(dragon.getMagic(), is(5));
//		assertThat(dragon2.getMagic(), is(5));
//		assertThat(dragon3.getMagic(), is(5));
//		
//}
}
