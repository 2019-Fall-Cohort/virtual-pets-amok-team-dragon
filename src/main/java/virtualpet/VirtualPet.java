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
		
	}

}
