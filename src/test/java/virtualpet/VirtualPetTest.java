package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

	
	private VirtualPet underTest;
	@Before
	public void setup() {
		underTest = new VirtualPet("Puff");		
	}
	
	@Test
	public void petShouldHaveName() {
		assertEquals(underTest.getName(), "Puff");
	}

	@Test
	public void shouldHaveDefaultHunger() {
		//assertEquals(underTest.Hunger, 10);
		assertTrue(underTest.Hunger >= 0 && underTest.Hunger <= 25);
	}
	@Test
	public void shouldHaveDefaultFatigue() {
		assertEquals(underTest.Fatigue, 10);
	}
	@Test
	public void shouldHaveDefaultMagic() {
		assertEquals(underTest.Magic, 10);
	}
	@Test
	public void shouldHaveDefaultBoredom() {
		assertEquals(underTest.Boredom, 10);
	}
	@Test
	public void shouldBeAbleToFeedPet() {
		assertEquals(underTest.feedDragon(2), 7);
	}
	@Test
	public void shouldBeAbleToSleep() {
		assertEquals(underTest.restDragon(2), 7);
	}
	@Test
	public void shouldBeAbleToPlay() {
		assertEquals(underTest.playWithDragon(2), 7);
	}	
		@Test
		public void shouldBeAbleToBreathFired() {
			assertEquals(underTest.breathsFire(2), 7);
	}
		@Test
		public void hungerShouldntGoBelowZero() {
			assertEquals(underTest.feedDragon(20), -1);
			
	}
		@Test
		public void fatigueShouldntGoBelowZero() {
			assertEquals(underTest.restDragon(20), -1);
			
	}
		@Test
		public void boredomShouldntGoBelowZero() {
			assertEquals(underTest.playWithDragon(20), -1);
	}
		@Test
		public void magicShouldntGoBelowZero() {
			assertEquals(underTest.breathsFire(20), -1);	
		}		
		@Test
		public void tickShouldHaveMethod() {
			underTest.tick();
			assertEquals(underTest.Hunger, 10);
			assertEquals(underTest.Fatigue, 10);
			assertEquals(underTest.Boredom, 10);
			assertEquals(underTest.Magic, 10);
			
		}
	
	
}

