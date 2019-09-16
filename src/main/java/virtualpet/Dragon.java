package virtualpet;

import java.util.Random;

public abstract class Dragon {

	static int minValue = 0;
	static int maxValue = 100;
	static int defaultValue = 10;

	private String name;
	private int magic;
	private int boredom;
	private int tickValue = 1;

	public Dragon(String givenName) {
		name = givenName;
		magic = defaultValue;
		boredom = defaultValue;
	}

	public String getName() {
		return name;
	}

	public int getMagic() {
		return magic;
	}

	public int getBoredom() {
		return boredom;
	}	
	
	private void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public void playWithDragon(int timePlayed) {
		int newBoredomValue = boredom - timePlayed;
		
		if (attributeWithinRange(newBoredomValue)) {
			setBoredom(newBoredomValue);
		}	
		else {
			setBoredom(minValue);
		}	
	}


//	public void tick() {
//		hunger = hunger + tickValue;
//		fatigue = fatigue + tickValue;
//		boredom = boredom + tickValue;
//		magic = magic + tickValue;
//		if (hunger > maxValue) {
//			hunger = maxValue;
//		}
////		if (fatigue > maxValue) {
////			fatigue = maxValue;
////		}
//		if (boredom > maxValue) {
//			boredom = maxValue;
//		}
//		if (magic > maxValue) {
//			magic = maxValue;
//		}
//	}

	public void displayPetAttributes() {

		System.out.println("");
		System.out.println("Current attributes for: " + name);
//		System.out.println("Hunger: " + hunger);
//		System.out.println("Fatigue: " + fatigue);
		System.out.println("Boredom: " + boredom);
		System.out.println("Magic: " + magic);
		System.out.println("");

	}

	public int newValue() {
		Random rand = new Random();
		int randomNum = rand.nextInt((maxValue - minValue) + 1) + minValue;
		return randomNum;
	}

	public int newValue(int newMaxValue) {
		Random rand = new Random();
		int randomNum = rand.nextInt(newMaxValue);
		return randomNum;
	}

	@Override
	public String toString() {
		return name;
	}

	public abstract void restDragon(int amountRested);
	
	public abstract void feedDragon(int amountFed);

	public boolean attributeWithinRange(int attribute) {

		boolean isWithinRange = true;

		if (attribute < minValue) {
			isWithinRange = false;
		}

		if (attribute > maxValue) {
			isWithinRange = false;
		}
		
		return isWithinRange;
	}

}