package virtualpet;

public class OrganicDragon extends Dragon {

	private int hunger;
	private int fatigue;

	public OrganicDragon(String givenName) {
		super(givenName);
		hunger = defaultValue;
		fatigue = defaultValue;
	}

	public int getHunger() {
		return hunger;
	}

	public int getFatigue() {
		return fatigue;
	}

	public void restDragon(int amountRested) {
		int newFatigueValue = fatigue - amountRested;

		if (attributeWithinRange(newFatigueValue)) {
			this.fatigue = newFatigueValue;
		} else {
			this.fatigue = minValue;
		}
	}

	public void feedDragon(int amountFed) {
		int newHungerValue = hunger - amountFed;

		if (attributeWithinRange(newHungerValue)) {
			this.hunger = newHungerValue;
		} else {
			this.hunger = minValue;
		}
	}
	
	public void displayOrganicAttributes() {
		System.out.println("");
		System.out.println("Current attributes for: " + this.getName());
		System.out.println("Dragon Type: Organic");
		System.out.println("Hunger: " + this.getHunger());
		System.out.println("Fatigue: " + this.getFatigue());
		System.out.println("Boredom: " + this.getBoredom());
		System.out.println(this.getElement() + " Magic: " + this.getMagic());
		System.out.println("");
	}
	
}
