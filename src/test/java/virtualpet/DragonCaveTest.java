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
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestFireRobotic);
		underTestCave.addPetToShelter(underTestOrganic);
		Collection<Dragon> addedPets = underTestCave.retrievePetList();
		assertThat(addedPets, containsInAnyOrder(underTestFireRobotic, underTestOrganic));
	}

	@Test
	public void shouldNotAddDuplicatePetNames() {
		Dragon underTestOrganic = new OrganicDragon("Bob");
		Dragon underTestRobotic = new RoboticDragon("Bob");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRobotic);
		underTestCave.addPetToShelter(underTestOrganic);
		Collection<Dragon> addedPets = underTestCave.retrievePetList();

		assertThat(underTestCave.petList.size(), is(1));

	}

	@Test
	public void shouldBeAbleToReturnPetByName() {
		Dragon underTestOrganic = new OrganicDragon("TestOrganic");
		Dragon underTestRobotic = new RoboticDragon("TestRobotic");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRobotic);
		underTestCave.addPetToShelter(underTestOrganic);
		Dragon retrieved = underTestCave.retrieveVirtualPet("TestOrganic");
		assertThat(retrieved, is(underTestOrganic));

		Dragon retrievedVirtualPet2 = underTestCave.retrieveVirtualPet("TestRobotic");
		assertThat(retrievedVirtualPet2, is(underTestRobotic));
	}

	@Test
	public void shouldBeAbleToPlayWithAllPets() throws Exception {

		Dragon underTestOrganic = new OrganicDragon("TestOrganic");
		Dragon underTestRobotic = new RoboticDragon("TestRobotic");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRobotic);
		underTestCave.addPetToShelter(underTestOrganic);

		underTestCave.playWithAllPets(4);
		assertThat(underTestRobotic.getBoredom(), is(6));
		assertThat(underTestOrganic.getBoredom(), is(6));
	}

	@Test
	public void shouldBeAbleToClearAsh() {
		OrganicIceDragon underTestOrganicIce = new OrganicIceDragon("TestFrosty");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestOrganicIce);

		underTestCave.doMagic(underTestOrganicIce, 2);
		int expected = underTestCave.getAshes();
		assertThat(expected, is(8));

	}

	@Test
	public void shouldBeAbleToClearAsh2() {
		RoboticIceDragon underTestRoboticIce = new RoboticIceDragon("TestFrosty");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRoboticIce);

		underTestCave.doMagic(underTestRoboticIce, 2);
		int expected = underTestCave.getAshes();
		assertThat(expected, is(8));
	}

	@Test
	public void shouldBeAbleToClearIcicles() {
		RoboticFireDragon underTestRoboticFire = new RoboticFireDragon("TestFlamey");
		RoboticFireDragon underTestRoboticFire2 = new RoboticFireDragon("TestFlamey");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRoboticFire);
		underTestCave.addPetToShelter(underTestRoboticFire2);
		underTestCave.doMagic(underTestRoboticFire, 2);
		underTestCave.doMagic(underTestRoboticFire2, 2);
		int expected = underTestCave.getIcicles();
		assertThat(expected, is(6));
	}
	
	@Test
	public void shouldBeAbleToAllDragons() throws Exception {
		RoboticFireDragon underTestRoboticFire = new RoboticFireDragon("Test Flamey");
		RoboticIceDragon underTestRoboticIce = new RoboticIceDragon("Test Flurry");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRoboticFire);
		underTestCave.addPetToShelter(underTestRoboticIce);
		OrganicFireDragon underTestOrganicFire = new OrganicFireDragon("Test Softy");
		OrganicIceDragon underTestOrganicIce = new OrganicIceDragon("Test Hardy");
		underTestCave.addPetToShelter(underTestOrganicFire);
		underTestCave.addPetToShelter(underTestOrganicIce);
		
		underTestCave.tickAll();
		
		assertThat(underTestRoboticFire.getBattery(), is(9));
		assertThat(underTestRoboticFire.getOil(), is(9));
		assertThat(underTestRoboticIce.getBoredom(), is(11));
		assertThat(underTestOrganicFire.getHunger(), is(11));
		assertThat(underTestOrganicIce.getFatigue(), is(11));
	}
	
	@Test
	public void shouldNotGoBelowZeroWithTick() throws Exception {
		RoboticFireDragon underTestRoboticFire = new RoboticFireDragon("Test Flamey");
		RoboticIceDragon underTestRoboticIce = new RoboticIceDragon("Test Flurry");
		DragonCave underTestCave = new DragonCave();
		underTestCave.addPetToShelter(underTestRoboticFire);
		underTestCave.addPetToShelter(underTestRoboticIce);
		
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		underTestCave.tickAll();
		
		assertThat(underTestRoboticIce.getBattery(), is(0));
		assertThat(underTestRoboticIce.getOil(), is(0));
		assertThat(underTestRoboticFire.getBattery(), is(0));
		assertThat(underTestRoboticFire.getOil(), is(0));
	}
}
