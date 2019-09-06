package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Puff");
		String expected = underTest.getName();
		assertEquals(expected, "Puff");
	}

	@Test
	public void petShouldHaveDifferentName() {
		VirtualPet underTest = new VirtualPet("Magic");
		String expected = underTest.getName();
		assertEquals(expected, "Magic");
	}
	
	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.getHunger;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultFatigue() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.getFatigue;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultMagic() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.getMagic;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultBoredom() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.getBoredom;
		assertEquals(expected, 10);
	}
}
