package virtualpet;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	HashMap<String, VirtualPet> petList;

	public VirtualPetShelter() {
		petList = new HashMap<>();

	}

	public void addPetToShelter(VirtualPet petToAdd) {
		petList.put(petToAdd.getName(), petToAdd);

	}

	public Collection<VirtualPet> retrievePetList() {
		return petList.values();
	}
	
	public VirtualPet retrieveVirtualpet(String petName) {
		return petList.get(petName);
	}

	public void tickAllPets() {
		for (VirtualPet pet: petList.values()) {
			pet.tick();
		}
		
	}

	public void feedAllPets(int amountFed) {
		for (VirtualPet pet: petList.values()) {
			pet.feedDragon(amountFed);
		}
		
	}

	public void playWithAllPets(int timePlayed) {
		for (VirtualPet pet: petList.values()) {
			pet.playWithDragon(timePlayed);
		}
		
	}

	public void restAllPets(int amountRested) {
		for (VirtualPet pet: petList.values()) {
			pet.restDragon(amountRested);
		}
		
	}

	public void doMagicWithAllPets(int breathFire) {
		for (VirtualPet pet: petList.values()) {
			pet.breathsFire(breathFire);
		}
		
	}
	
}
