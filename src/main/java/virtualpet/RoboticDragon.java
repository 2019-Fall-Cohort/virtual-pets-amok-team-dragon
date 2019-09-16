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

	private void setOil(int oil) {
		this.oil = oil;
	}

	public int getBattery() {
		return battery;
	}

	private void setBattery(int battery) {
		this.battery = battery;
	}

	public void restDragon(int amountCharged) {		
		int newBatteryValue = battery + amountCharged;
		
		if (attributeWithinRange(newBatteryValue)) {
			setBattery(newBatteryValue);
		}	
		else {
			setBattery(maxValue);
		}	
	}
	
	public void feedDragon(int amountOfMaintenance) {
		int newOilValue = oil + amountOfMaintenance;
		
		if (attributeWithinRange(newOilValue)) {
			setOil(newOilValue);
		}	
		else {
			setOil(maxValue);
		}			
	}

}