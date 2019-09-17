package virtualpet;

public class RoboticFireDragon extends RoboticDragon implements BreathesFire{

	public RoboticFireDragon(String givenName) {
		super(givenName);

	}

	@Override
	public void breathFire(int amount) {
		setMagic(getMagic()-amount);		
	}
}
