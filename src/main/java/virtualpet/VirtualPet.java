package virtualpet;

import java.util.Random;

public class VirtualPet {
	
	// Constants
	static int minValue = 0;
	static int maxValue = 100;	
	
	// Pet Attributes
	public String name;
	public int Hunger = newValue(25);
	public int Fatigue = newValue(25);
	public int Magic = newValue(15);
	public int Boredom = newValue(25);
	public int tickValue = newValue(10);
	
	
	public VirtualPet(String givenName) {
		name = givenName;
	}

	public String getName() {
		return name;
	}

	public int feedDragon(int amountFed) {
		amountFed = amountFed + tickValue;
		Hunger = Hunger - amountFed;
		if(Hunger < minValue){
			Hunger = minValue - tickValue;
		}
		if(Hunger >= maxValue) {
			Hunger = maxValue - tickValue;
		}
		return Hunger;
	}

	public int restDragon(int amountRested) {
		amountRested = amountRested + tickValue;
		Fatigue = Fatigue - amountRested;
		if(Fatigue < minValue) {
			Fatigue = minValue - tickValue;
		}
		if(Fatigue >= maxValue) {
			Fatigue = maxValue - tickValue;
		}
		return Fatigue;
	}

	public int playWithDragon(int timePlayed) {
		timePlayed = timePlayed + tickValue;
		Boredom = Boredom - timePlayed;
		if(Boredom < minValue) {
			Boredom = minValue - tickValue;
		} 
		if (Boredom >= maxValue) {
			Boredom = maxValue - tickValue;
		}
			
		return Boredom;
	}

	public int breathsFire(int breathFire) {
		breathFire = breathFire + tickValue;
		Magic = Magic - breathFire;
		if(Magic < minValue) {
			return Magic = minValue - tickValue;
		}
		if(Magic >= maxValue) {
			Magic = maxValue - tickValue;
		}
		return Magic;
	}

	public void tick() {
		Hunger = Hunger + tickValue;
		Fatigue = Fatigue + tickValue;
		Boredom = Boredom + tickValue;
		Magic = Magic + tickValue;
		if (Hunger >maxValue) {
			Hunger = maxValue;
		}
		if (Fatigue >maxValue) {
			Fatigue =maxValue;
		}
		if (Boredom >maxValue) {
			Boredom =maxValue;
		}
		if (Magic >maxValue) {
			Magic =maxValue;
		}
	}
	public void displayMenu() {
		
		System.out.println("");
		System.out.println("Current attributes for: " + name);
		System.out.println("Hunger: " + Hunger);
		System.out.println("Fatigue: " + Fatigue);
		System.out.println("Boredom: " + Boredom);
		System.out.println("Magic: " + Magic);
		System.out.println("");
				
	}
	
	public int newValue(){
		Random rand = new Random();
		int randomNum = rand.nextInt((maxValue - minValue) + 1) + minValue;
		return randomNum;
	}
	
	public int newValue(int newMaxValue){
		Random rand = new Random();
		int randomNum = rand.nextInt(newMaxValue);
		return randomNum;
	}
}
