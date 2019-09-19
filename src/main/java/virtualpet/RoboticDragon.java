package virtualpet;

public class RoboticDragon extends Dragon {

	private int oil;
	private int battery;

	public RoboticDragon(String givenName) {
		super(givenName);
		oil = defaultValue;
		battery = defaultValue;

	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void restDragon(int amountCharged) {
		int newBatteryValue = battery + amountCharged;

		if (attributeWithinRange(newBatteryValue)) {
			setBattery(newBatteryValue);
		} else {
			setBattery(maxValue);
		}
	}

	public void feedDragon(int amountOfMaintenance) {
		int newOilValue = oil + amountOfMaintenance;

		if (attributeWithinRange(newOilValue)) {
			setOil(newOilValue);
		} else {
			setOil(maxValue);
		}
	}

	public void displayRoboticAttributes() {
		System.out.println("");
		System.out.println("Current attributes for: " + this.getName());
		System.out.println("Dragon Type: Robotic " + this.getElement());
		System.out.println("Oil: " + this.getOil());
		System.out.println("Battery: " + this.getBattery());
		System.out.println("Boredom: " + this.getBoredom());
		System.out.println(this.getElement() + " Magic: " + this.getMagic());
		System.out.println("");
	}
}
