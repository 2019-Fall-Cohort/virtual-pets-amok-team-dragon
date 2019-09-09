package virtualpet;

public class VirtualPet {
	
	public String name;
	public int Hunger = 10;
	public int Fatigue = 10;
	public int Magic = 10;
	public int Boredom = 10;

	public VirtualPet(String givenName) {
		name = givenName;
	}

	public String getName() {
		return name;
	}

	public int feedDragon(int amountFed) {
		amountFed++;
		Hunger = Hunger - amountFed;
		if(Hunger < 0){
			Hunger = -1;
		}
		if(Hunger >=10) {
			Hunger = 9;
		}
		return Hunger;
	}

	public int restDragon(int amountRested) {
		amountRested++;
		Fatigue = Fatigue - amountRested;
		if(Fatigue < 0) {
			Fatigue = -1;
		}
		return Fatigue;
	}

	public int playWithDragon(int timePlayed) {
		timePlayed++;
		Boredom = Boredom - timePlayed;
		if(Boredom < 0) {
			Boredom = -1;
		} 
			
		return Boredom;
	}

	public int breathsFire(int breathFire) {
		breathFire++;
		Magic = Magic - breathFire;
		if(Magic < 0) {
			return Magic = -1;
		}
		return Magic;
	}

	public void tick() {
		Hunger ++;
		Fatigue ++;
		Boredom ++;
		Magic ++;
		if (Hunger >10) {
			Hunger = 10;
		}
		if (Fatigue >10) {
			Fatigue =10;
		}
		if (Boredom >10) {
			Boredom =10;
		}
		if (Magic >10) {
			Magic =10;
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
}
