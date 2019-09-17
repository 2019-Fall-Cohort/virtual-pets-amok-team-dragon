package virtualpet;

public class OrganicIceDragon extends OrganicDragon implements BlowsBitterWind{

	public OrganicIceDragon(String givenName) {
		super(givenName);
	}

	@Override
	public void blowBitterWind() {
		//wicked cold draft, man.
	}
}
