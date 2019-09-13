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
	
	public String[] retrieveAllPetAttributes() {
		
		String[] allPetAttributes = new String[petList.size()];
		String arrayRow = "";
		
		for (VirtualPet pet: petList.values()) {
			
			arrayRow = (String.format("|%-10s",  pet.getName())) +
					(String.format("|%-10d",  pet.getHunger())) +
					(String.format("|%-10d",  pet.getFatigue())) +
					(String.format("|%-10d",  pet.getBoredom())) +
					(String.format("|%-10d|",  pet.getMagic()));
		}
		System.out.println(arrayRow);
		return allPetAttributes;
	}
	
}
