package virtualpet;

public class OrganicFireDragon extends OrganicDragon implements BreathesFire {

	public OrganicFireDragon(String givenName) {
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
