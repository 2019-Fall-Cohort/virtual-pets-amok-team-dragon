package virtualpettest;

public class VirtualPetTest {
	
	@Test
	public void ShouldBeAbleCreatePet() {
		VirtualPet pet= new VirtualPet();
		
	}

}
@Test
public void petShouldHaveName() {
	VirtualPet pet = new VirtualPet("Puff")
	String expected = pet.getName();
	assertEquals(expected, "Puff");
	
}