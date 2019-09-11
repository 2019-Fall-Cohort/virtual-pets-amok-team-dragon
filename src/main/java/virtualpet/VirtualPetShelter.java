package virtualpet;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

	List<VirtualPet> petList;

	public VirtualPetShelter() {
		petList = new ArrayList<>();

	}

	public void addPetToShelter(VirtualPet petToAdd) {
		petList.add(petToAdd);

	}

	public List<VirtualPet> retrievePetList() {
		return petList;
	}
	
	
}
