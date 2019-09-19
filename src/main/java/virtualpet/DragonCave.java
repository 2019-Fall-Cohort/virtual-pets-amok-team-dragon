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
			if (pet instanceof OrganicDragon) {
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

	public int getAshes() {
		return ashBuildUp;
	}

	public void setAshes(int amount) {
		this.ashBuildUp = amount;
	}

	public void doMagic(Dragon dragon, int amount) {
		if (dragon instanceof RoboticIceDragon) {
			RoboticIceDragon icedragon = (RoboticIceDragon) dragon;
			icedragon.blowBitterWind(amount);
			setAshes(getAshes() - amount);
			Double doubleD = (getIcicles() * 1.5);
			int newIceValue = doubleD.intValue();
			setIcicles(newIceValue);
		} else if (dragon instanceof OrganicIceDragon) {
			OrganicIceDragon icedragon = (OrganicIceDragon) dragon;
			icedragon.blowBitterWind(amount);
			setAshes(getAshes() - amount);
			Double doubleD = (getIcicles() * 1.5);
			int newIceValue = doubleD.intValue();
			setIcicles(newIceValue);
		} else if (dragon instanceof RoboticFireDragon) {
			RoboticFireDragon firedragon = (RoboticFireDragon) dragon;
			firedragon.breathFire(amount);
			setIcicles(getIcicles() - amount);
			Double doubleD = (getAshes() * 1.5);
			int newAshValue = doubleD.intValue();
			setAshes(newAshValue);
		} else if (dragon instanceof OrganicFireDragon) {
			OrganicFireDragon firedragon = (OrganicFireDragon) dragon;
			firedragon.breathFire(amount);
			setIcicles(getIcicles() - amount);
			Double doubleD = (getAshes() * 1.5);
			int newAshValue = doubleD.intValue();
			setAshes(newAshValue);
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
			if (pet instanceof RoboticDragon) {
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

	public void doMagicWithAllPets(int amount) {
		for (Dragon pet : petList.values()) {
			this.doMagic(pet, amount);
		}
	}

	public void feedAllPets(int amount) {
		for (Dragon pet : petList.values()) {
			pet.feedDragon(amount);
		}
	}

	public void retrieveShelterAttributes() {
		String shelterAttributes = (String.format("|%-17d", this.getAshes()))
				+ (String.format("|%-17d|", this.getIcicles()));
		System.out.println(shelterAttributes);

	}

	public void tickAll() {
		for (Dragon dragon : petList.values()) {
			if (dragon instanceof RoboticIceDragon) {
				RoboticIceDragon icedragon = (RoboticIceDragon) dragon;

				int newValue = icedragon.getOil() - icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setOil(newValue);
				} else {
					icedragon.setOil(icedragon.minValue);
				}

				newValue = icedragon.getBattery() - icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setBattery(newValue);
				} else {
					icedragon.setBattery(icedragon.minValue);
				}

				newValue = icedragon.getMagic() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setMagic(newValue);
				} else {
					icedragon.setMagic(icedragon.maxValue);
				}

				newValue = icedragon.getBoredom() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setBoredom(newValue);
				} else {
					icedragon.setBoredom(icedragon.maxValue);
				}

			} else if (dragon instanceof OrganicIceDragon) {
				OrganicIceDragon icedragon = (OrganicIceDragon) dragon;

				int newValue = icedragon.getHunger() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setHunger(newValue);
				} else {
					icedragon.setHunger(icedragon.maxValue);
				}

				newValue = icedragon.getFatigue() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setFatigue(newValue);
				} else {
					icedragon.setFatigue(icedragon.maxValue);
				}

				newValue = icedragon.getMagic() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setMagic(newValue);
				} else {
					icedragon.setMagic(icedragon.maxValue);
				}

				newValue = icedragon.getBoredom() + icedragon.tickValue;
				if (icedragon.attributeWithinRange(newValue)) {
					icedragon.setBoredom(newValue);
				} else {
					icedragon.setBoredom(icedragon.maxValue);
				}

			} else if (dragon instanceof RoboticFireDragon) {
				RoboticFireDragon firedragon = (RoboticFireDragon) dragon;
				int newValue = firedragon.getOil() - firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setOil(newValue);
				} else {
					firedragon.setOil(firedragon.minValue);
				}

				newValue = firedragon.getBattery() - firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setBattery(newValue);
				} else {
					firedragon.setBattery(firedragon.minValue);
				}

				newValue = firedragon.getMagic() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setMagic(newValue);
				} else {
					firedragon.setMagic(firedragon.maxValue);
				}

				newValue = firedragon.getBoredom() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setBoredom(newValue);
				} else {
					firedragon.setBoredom(firedragon.maxValue);
				}

			} else if (dragon instanceof OrganicFireDragon) {
				OrganicFireDragon firedragon = (OrganicFireDragon) dragon;
				int newValue = firedragon.getHunger() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setHunger(newValue);
				} else {
					firedragon.setHunger(firedragon.maxValue);
				}

				newValue = firedragon.getFatigue() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setFatigue(newValue);
				} else {
					firedragon.setFatigue(firedragon.maxValue);
				}

				newValue = firedragon.getMagic() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setMagic(newValue);
				} else {
					firedragon.setMagic(firedragon.maxValue);
				}

				newValue = firedragon.getBoredom() + firedragon.tickValue;
				if (firedragon.attributeWithinRange(newValue)) {
					firedragon.setBoredom(newValue);
				} else {
					firedragon.setBoredom(firedragon.maxValue);
				}

			}
		}
	}
}
