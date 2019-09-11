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
	
}
