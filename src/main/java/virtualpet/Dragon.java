package virtualpet;
import java.util.Random;

public class Dragon {
	
	// Constants
	static int minValue = 0;
	static int maxValue = 100;	
	
	// Pet Attributes
	private String name; 
	private int hunger;
	private int fatigue;
	private int magic;  
	private int boredom;
	private int tickValue;
	
	public Dragon(String givenName) {
		//Parking Lot:  set defaults with a random number generator
		name = givenName;
		hunger = 10;
		fatigue = 10;
		magic = 10;
		boredom = 10;
		tickValue = 1;
	}

	public String getName() {
		return name;
	}
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int amountFed) {
		hunger= hunger-amountFed;
	}
	public int getFatigue() {
		return fatigue;
	}
	public int getMagic() {
		return magic;
	}
	public int getBoredom() {
		return boredom;
	}
	public int feedDragon(int amountFed) {
		amountFed = amountFed + tickValue;
		hunger = hunger - amountFed;
		if(hunger < minValue){
			hunger = minValue - tickValue;
		}
		if(hunger >= maxValue) {
			hunger = maxValue - tickValue;
		}
		return hunger;
	}
	public int restDragon(int amountRested) {
		amountRested = amountRested + tickValue;
		fatigue = fatigue - amountRested;
		if(fatigue < minValue) {
			fatigue = minValue - tickValue;
		}
		if(fatigue >= maxValue) {
			fatigue = maxValue - tickValue;
		}
		return fatigue;
	}
	public int playWithDragon(int timePlayed) {
		timePlayed = timePlayed + tickValue;
		boredom = boredom - timePlayed;
		if(boredom < minValue) {
			boredom = minValue - tickValue;
		} 
		if (boredom >= maxValue) {
			boredom = maxValue - tickValue;
		}
			
		return boredom;
	}
	public int breathsFire(int breathFire) {
		breathFire = breathFire + tickValue;
		magic = magic - breathFire;
		if(magic < minValue) {
			return magic = minValue - tickValue;
		}
		if(magic >= maxValue) {
			magic = maxValue - tickValue;
		}
		return magic;
	}
	public void tick() {
		hunger = hunger + tickValue;
		fatigue = fatigue + tickValue;
		boredom = boredom + tickValue;
		magic = magic + tickValue;
		if (hunger >maxValue) {
			hunger = maxValue;
		}
		if (fatigue >maxValue) {
			fatigue =maxValue;
		}
		if (boredom >maxValue) {
			boredom =maxValue;
		}
		if (magic >maxValue) {
			magic =maxValue;
		}
	}
	public void displayPetAttributes() {
		
		System.out.println("");
		System.out.println("Current attributes for: " + name);
		System.out.println("Hunger: " + hunger);
		System.out.println("Fatigue: " + fatigue);
		System.out.println("Boredom: " + boredom);
		System.out.println("Magic: " + magic);
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
	@Override
	public String toString()
	{
	    return name; 
	}
}
