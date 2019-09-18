package virtualpet;

public class RoboticIceDragon extends RoboticDragon implements BlowsBitterWind {

	public RoboticIceDragon(String givenName) {
		super(givenName);

	}

	@Override
	public void blowBitterWind(int amount) {
		int newMagicValue = this.getMagic() - amount;
		if (this.attributeWithinRange(newMagicValue)) {
			this.setMagic(newMagicValue);
		} else {
			this.setMagic(minValue);
		}
	}
}
