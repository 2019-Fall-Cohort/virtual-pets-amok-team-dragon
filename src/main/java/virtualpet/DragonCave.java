package virtualpet;

import java.util.Collection;
import java.util.HashMap;

public class DragonCave {

	HashMap<String, Dragon> petList;

	public DragonCave() {
		petList = new HashMap<>();

	}
	
	public void addPetToShelter(Dragon petToAdd) {
		petList.put(petToAdd.getName(), petToAdd);

	}

	public Collection<Dragon> retrievePetList() {
		return petList.values();
	}
	
	public Dragon retrieveVirtualpet(String petName) {
		return petList.get(petName);
	}

	public void tickAllPets() {
		for (Dragon pet: petList.values()) {
//			pet.tick();
		}
		
	}

//	public void feedAllPets(int amountFed) {
//		for (Dragon pet: petList.values()) {
//			pet.feedDragon(amountFed);
//		}
//		
//	}

	public void playWithAllPets(int timePlayed) {
		for (Dragon pet: petList.values()) {
			pet.playWithDragon(timePlayed);
		}
		
	}

	public void restAllPets(int amountRested) {
		for (Dragon pet: petList.values()) {
			pet.restDragon(amountRested);
		}
		
	}

//	public void doMagicWithAllPets(int breathFire) {
//		for (Dragon pet: petList.values()) {
//			pet.breathsFire(breathFire);
//		}
//		
//	}
	
	public String[] retrieveAllPetAttributes() {
		
		String[] allPetAttributes = new String[petList.size()];
		String arrayRow = "";
		
		for (Dragon pet: petList.values()) {
			
			arrayRow = (String.format("|%-10s",  pet.getName())) +
//					(String.format("|%-10d",  pet.getHunger())) +
//					(String.format("|%-10d",  pet.getFatigue())) +
					(String.format("|%-10d",  pet.getBoredom())) +
					(String.format("|%-10d|",  pet.getMagic()));
		}
		System.out.println(arrayRow);
		return allPetAttributes;
	}
	
}
