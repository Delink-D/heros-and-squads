import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
	@Test public void hero_isIntentiatingCorrectly() {
		Hero testHero = new Hero("Delink",18);
		assertEquals(true, testHero instanceof Hero);
	}

	@Test public void getName_isAbleToGetName_Derick() {
		Hero testHero = new Hero("Delink",18);
		assertEquals("Delink", testHero.getName());
	}

	@Test public void getAge_isAbleToGetAge_18() {
		Hero testHero = new Hero("Delink",18);
		assertEquals(18, testHero.getAge());
	}

	@Test public void getPower_isAbleToGetPower_random() {
		Hero testHero = new Hero("Delink",18);
		String expected = testHero.getPower();
		assertEquals(expected, expected);
	}

	@Test public void getHeros_isAbleToGetAllHeros_true() {
		Hero testHero1 = new Hero("Delink",18);
		Hero testHero2 = new Hero("Derick",16);

		assertTrue(Hero.getHeros().contains(testHero1));
		assertTrue(Hero.getHeros().contains(testHero2));
	}

	@Test public void clear_emptiesAllHerosFromArrayList_0() {
		Hero testTask = new Hero("Delink",18);
		Hero.clear();
		assertEquals(Hero.getHeros().size(), 0);
	}

	@Test public void getId_isAbleToGetId_1() {
		Hero.clear();
		Hero testHero = new Hero("Delink",18);
		assertEquals(1, testHero.getId());
	}
}