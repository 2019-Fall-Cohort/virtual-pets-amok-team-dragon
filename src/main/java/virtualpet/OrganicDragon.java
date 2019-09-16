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

	private void setHunger(int amountFed) {
		hunger = hunger - amountFed;
	}

	public int getFatigue() {
		return fatigue;
	}

	private void setFatigue(int amountRested) {
		fatigue = fatigue - amountRested;
	}

	public void restDragon(int amountRested) {		
		int newFatigueValue = fatigue - amountRested;
		
		if (attributeWithinRange(newFatigueValue)) {
			setFatigue(newFatigueValue);
		}	
		else {
			setFatigue(minValue);
		}	
	}
	
	public void feedDragon(int amountFed) {
		int newHungerValue = hunger - amountFed;
		
		if (attributeWithinRange(newHungerValue)) {
			setHunger(newHungerValue);
		}	
		else {
			setHunger(minValue);
		}			
	}

}
