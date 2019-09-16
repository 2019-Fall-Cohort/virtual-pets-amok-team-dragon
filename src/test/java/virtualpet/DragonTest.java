package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DragonTest {

	private Dragon underTest;

	@Before
	public void setup() {
		underTest = new OrganicDragon("Puff");
	}

	@Test
	public void shouldBeAbleToPlay() {
		underTest.playWithDragon(2);
		int expected = underTest.getBoredom();
		assertEquals(expected, 8);
	}

	@Test
	public void boredomShouldntGoBelowZero() {
		underTest.playWithDragon(15);
		int expected = underTest.getBoredom();
		assertEquals(expected, 0);
	}

	

//	@Test
//	public void tickShouldHaveMethod() {
//		underTest.tick();
//		int hunger = underTest.getHunger();
//		int fatigue = underTest.getFatigue();
//		int boredom = underTest.getBoredom();
//		int magic = underTest.getMagic();
//		assertEquals(hunger, 11);
//		assertEquals(fatigue, 11);
//		assertEquals(boredom, 11);
//		assertEquals(magic, 11);
//
//	}

}
