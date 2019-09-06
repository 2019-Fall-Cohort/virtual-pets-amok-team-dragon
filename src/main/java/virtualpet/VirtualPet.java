package virtualpet;

public class VirtualPet {
	String name;
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
		Hunger = Hunger - amountFed;
		if(Hunger - amountFed < 0) {
			Hunger = 0;
		}
		return Hunger;
	}

	public int restDragon(int amountRested) {
		Fatigue = Fatigue - amountRested;
		if(Fatigue - amountRested < 0) {
			Fatigue = 0;
		}
		return Fatigue;
	}

	public int playWithDragon(int timePlayed) {
		Boredom = Boredom - timePlayed;
		if(Boredom - timePlayed < 0) {
			Boredom = 0;
		}
		return Boredom;
	}

	public int breathsFire(int breathFire) {
		Magic = Magic - breathFire;
		if(Magic - breathFire < 0) {
			return Magic = 0;
		}
		return Magic;
	}

	public void tick() {
		Hunger ++;
		Fatigue ++;
		Boredom ++;
		Magic ++;
		
	}

}
