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
	Dragon underTestFireRobotic = new RoboticFireDragon("TestFireRobotic");
	DragonCave underTestCave= new DragonCave();
	underTestCave.addPetToShelter(underTestFireRobotic);
	underTestCave.addPetToShelter(underTestOrganic); 
	Collection<Dragon> addedPets = underTestCave.retrievePetList();
	assertThat(addedPets, containsInAnyOrder(underTestFireRobotic , underTestOrganic));
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

}
