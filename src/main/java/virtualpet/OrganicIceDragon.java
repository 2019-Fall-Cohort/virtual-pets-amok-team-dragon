package virtualpet;

public class OrganicIceDragon extends OrganicDragon implements BlowsBitterWind {

	public OrganicIceDragon(String givenName) {
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
