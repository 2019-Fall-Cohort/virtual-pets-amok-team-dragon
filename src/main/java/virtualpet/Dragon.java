package virtualpet;

import java.util.Random;

public abstract class Dragon {

	static int minValue = 0;
	static int maxValue = 100;
	static int defaultValue = 10;

	private String name;
	private int magic;
	private int boredom;

	public Dragon(String givenName) {
		name = givenName;
		magic = defaultValue;
		boredom = defaultValue;
	}

	public String getName() {
		return name;
	}

	public void setMagic(int magic) {
		this.magic = magic;		
	}

	public int getMagic() {
		return magic;
	}

	public int getBoredom() {
		return boredom;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public void playWithDragon(int timePlayed) {
		int newBoredomValue = boredom - timePlayed;

		if (attributeWithinRange(newBoredomValue)) {
			setBoredom(newBoredomValue);
		} else {
			setBoredom(minValue);
		}
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
	
	public String getElement() {
		
		if (this instanceof BreathesFire) {
			return "Fire";
		}
		if (this instanceof BlowsBitterWind) {
			return "Ice";
		}		
		return "Inbred";
	}

}
