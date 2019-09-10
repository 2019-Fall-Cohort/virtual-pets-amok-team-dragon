package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

	
	private VirtualPet underTest;
	@Before
	public void setup() {
		underTest = new VirtualPet("Puff");		
	}


	@Test
	public void shouldBeAbleToFeedPet() {
		int expected = underTest.feedDragon(2);
		assertEquals(expected, 7);
	}
	@Test
	public void shouldBeAbleToSleep() {
		int expected = underTest.restDragon(2);
		assertEquals(expected, 7);
	}
	@Test
	public void shouldBeAbleToPlay() {
		int expected = underTest.playWithDragon(2);
		assertEquals(expected, 7);
	}	
		@Test
		public void shouldBeAbleToBreathFired() {
			int expected = underTest.breathsFire(2);
			assertEquals(expected, 7);
	}
		@Test
		public void hungerShouldntGoBelowZero() {
			int expected = underTest.feedDragon(20);
			assertEquals(expected, -1);
			
	}
		@Test
		public void fatigueShouldntGoBelowZero() {
			int expected = underTest.restDragon(20);
			assertEquals(expected, -1);
			
	}
		@Test
		public void boredomShouldntGoBelowZero() {
			int expected = underTest.playWithDragon(20);
			assertEquals(expected, -1);
	}
		@Test
		public void magicShouldntGoBelowZero() {
			int expected = underTest.breathsFire(20);
			assertEquals(expected, -1);	
		}		
		@Test
		public void tickShouldHaveMethod() {
			underTest.tick();
			int hunger = underTest.getHunger();
			int fatigue = underTest.getFatigue();
			int boredom = underTest.getBoredom();
			int magic = underTest.getMagic();
			assertEquals(hunger, 10);
			assertEquals(fatigue, 10);
			assertEquals(boredom, 10);
			assertEquals(magic, 10);
			
		}
	
	
}

