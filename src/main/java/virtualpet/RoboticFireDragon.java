package virtualpet;

public class RoboticFireDragon extends RoboticDragon implements BreathesFire {

	public RoboticFireDragon(String givenName) {
		super(givenName);

	}

	@Override
	public void breathFire(int amount) {
		int newMagicValue = this.getMagic() - amount;
		if (this.attributeWithinRange(newMagicValue)) {
			this.setMagic(newMagicValue);
		} else {
			this.setMagic(minValue);
		}
	}
}
