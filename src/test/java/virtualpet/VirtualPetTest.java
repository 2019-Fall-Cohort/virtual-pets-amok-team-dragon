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
		int expected = underTest.Hunger;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultFatigue() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.Fatigue;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultMagic() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.Magic;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldHaveDefaultBoredom() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.Boredom;
		assertEquals(expected, 10);
	}
	@Test
	public void shouldBeAbleToFeedPet() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.feedDragon(2);
		assertEquals(underTest.Hunger, 8);
	}
	@Test
	public void shouldBeAbleToSleep() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.restDragon(2);
		assertEquals(underTest.Fatigue, 8);
	}
	@Test
	public void shouldBeAbleToPlay() {
		VirtualPet underTest = new VirtualPet("Dragon");
		int expected = underTest.playWithDragon(2);
		assertEquals(underTest.Boredom, 8);
	}	
		@Test
		public void shouldBeAbleToBreathFired() {
			VirtualPet underTest = new VirtualPet("Dragon");
			int expected = underTest.breathsFire(2);
			assertEquals(underTest.Magic, 8);
	}
		@Test
		public void hungerShouldntGoBelowZero() {
			VirtualPet underTest = new VirtualPet("Dragon");
			int expected = underTest.feedDragon(20);
			assertEquals(underTest.Hunger, 0);
			
	}
		@Test
		public void fatigueShouldntGoBelowZero() {
			VirtualPet underTest = new VirtualPet("Dragon");
			int expected = underTest.restDragon(20);
			assertEquals(underTest.Fatigue, 0);
			
	}
		@Test
		public void boredomShouldntGoBelowZero() {
			VirtualPet underTest = new VirtualPet("Dragon");
			int expected = underTest.playWithDragon(20);
			assertEquals(underTest.Boredom, 0);
	}
		@Test
		public void magicShouldntGoBelowZero() {
			VirtualPet underTest = new VirtualPet("Dragon");
			int expected = underTest.breathsFire(20);
			assertEquals(underTest.Magic, 0);	
		}		
		@Test
		public void tickShouldHaveMethod() {
			VirtualPet underTest = new VirtualPet ("Dragon");
			underTest.tick();
			assertEquals(underTest.Hunger, 11);
			assertEquals(underTest.Fatigue, 11);
			assertEquals(underTest.Boredom, 11);
			assertEquals(underTest.Magic, 11);
			
		}
		
}

