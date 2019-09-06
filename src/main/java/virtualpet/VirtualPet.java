package virtualpet;

public class VirtualPet {
	String name;
	public int getHunger = 10;
	public int getFatigue = 10;
	public int getMagic = 10;
	public int getBoredom = 10;

	public VirtualPet(String givenName) {
		name = givenName;
	}

	public String getName() {
		return name;
	}

}
