package virtualpet;

import java.util.HashMap;
import java.util.List;

public class VirtualPetShelter {

	HashMap<String, VirtualPet> petList = new HashMap<String, VirtualPet>();

	public VirtualPetShelter(String petName, VirtualPet petToAdd) {
		petList.entrySet();

	}

	public void addPetToShelter(VirtualPet petToAdd) {
		petList.put(petToAdd);

	}

	public List<VirtualPet> retrievePetList() {
		return petList;
	}
}
