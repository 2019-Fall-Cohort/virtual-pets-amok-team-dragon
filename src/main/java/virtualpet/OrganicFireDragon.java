package virtualpet;

public class OrganicFireDragon extends OrganicDragon implements BreathesFire{

	public OrganicFireDragon(String givenName) {
		super(givenName);
	}
	
	@Override
	public void breathFire(int amount) {
		setMagic(getMagic()-amount);
	}
}
