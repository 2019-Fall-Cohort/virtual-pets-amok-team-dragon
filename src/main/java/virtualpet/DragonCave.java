package virtualpet;

import java.util.Collection;
import java.util.HashMap;

public class DragonCave {

	HashMap<String, Dragon> petList;
	int ashBuildUp = 10;
	int icicleBuildUp = 10;

	public DragonCave() {
		petList = new HashMap<>();

	}

	public void addPetToShelter(Dragon petToAdd) {
		petList.put(petToAdd.getName(), petToAdd);

	}

	public Collection<Dragon> retrievePetList() {
		return petList.values();
	}

	public Dragon retrieveVirtualPet(String petName) {
		return petList.get(petName);
	}

	public void tickAllPets() {
		for (Dragon pet : petList.values()) {
			// pet.tick();
		}

	}

	public void playWithAllPets(int timePlayed) {
		for (Dragon pet : petList.values()) {
			pet.playWithDragon(timePlayed);
		}

	}

	public void restAllPets(int amountRested) {
		for (Dragon pet : petList.values()) {
			pet.restDragon(amountRested);
		}

	}

	public void retrieveOrganicPetAttributes() {

		String arrayRow = "";

		for (Dragon pet : petList.values()) {
			if (pet instanceof OrganicDragon){	
				OrganicDragon organicDragon = (OrganicDragon) pet;
				arrayRow = (String.format("|%-10s", organicDragon.getName())) 
						+ (String.format("|%-10s", organicDragon.getElement()))
						+ (String.format("|%-10d", organicDragon.getHunger())) 
						+ (String.format("|%-10d", organicDragon.getFatigue())) 
						+ (String.format("|%-10d", organicDragon.getBoredom()))
						+ (String.format("|%-10d|", organicDragon.getMagic()));		
				System.out.println(arrayRow);
			}
		}
	}

	public int getAsh() {
		return ashBuildUp;
	}

	public void setAsh(int amount) {
		this.ashBuildUp = amount;
	}

	public void doMagic(Dragon dragon, int amount) {
		if (dragon instanceof RoboticIceDragon) {
			RoboticIceDragon icedragon = (RoboticIceDragon) dragon;
			icedragon.blowBitterWind(amount);
			setAsh(getAsh() - amount);
		} else if (dragon instanceof OrganicIceDragon) {
			OrganicIceDragon icedragon = (OrganicIceDragon) dragon;
			icedragon.blowBitterWind(amount);
			setAsh(getAsh() - amount);
		} else if (dragon instanceof RoboticFireDragon) {
			RoboticFireDragon firedragon = (RoboticFireDragon) dragon;
			firedragon.breathFire(amount);
			setIcicles(getIcicles() - amount);
		} else if (dragon instanceof OrganicFireDragon) {
			OrganicFireDragon firedragon = (OrganicFireDragon) dragon;
			firedragon.breathFire(amount);
			setIcicles(getIcicles() - amount);
		}

	}

	public int getIcicles() {
		return icicleBuildUp;
	}

	public void setIcicles(int icicleBuildUp) {
		this.icicleBuildUp = icicleBuildUp;
	}

	public void retrieveAllRoboticPetAttributes() {
		String arrayRow = "";
		for (Dragon pet : petList.values()) {
			if (pet instanceof RoboticDragon){
				RoboticDragon roboticDragon = (RoboticDragon) pet;
				arrayRow = (String.format("|%-10s", roboticDragon.getName())) 
						+ (String.format("|%-10s", roboticDragon.getElement()))
						+ (String.format("|%-10d", roboticDragon.getOil())) 
						+ (String.format("|%-10d", roboticDragon.getBattery())) 
						+ (String.format("|%-10d", roboticDragon.getBoredom()))
						+ (String.format("|%-10d|", roboticDragon.getMagic()));
				System.out.println(arrayRow);
			}
		}		
	}

}
