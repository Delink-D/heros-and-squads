import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest {
	@Test public void squad_isIntentiatingCorrectly() {
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		assertEquals(true, testSquad instanceof Squad);
	}

	@Test public void getName_isGettingTHeName_TheGits() {
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		assertEquals("The Gits", testSquad.getName());
	}

	@Test public void getSize_isGettingTheSize_5() {
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		assertEquals(5, testSquad.getSize());
	}

	@Test public void getId_isGettingSquadId_1() {
		Squad.clear();
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		assertEquals(1, testSquad.getId());
	}

	@Test public void getSquads_isGettingAllSquads_true() {
		Squad testSquad1 = new Squad("The Gits", 5, "To fight for the onliners");
		Squad testSquad2 = new Squad("The Onliners", 6, "To fight for free internet");
		assertTrue(Squad.getSquads().contains(testSquad1));
		assertTrue(Squad.getSquads().contains(testSquad2));
	}

	@Test public void clear_isclearingTheList_0() {
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		Squad.clear();
		assertEquals(0, testSquad.getSquads().size());
	}

	@Test public void getHeros_itReturnsEmptyList_ArrayList() {
		Squad.clear();
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		assertEquals(0, testSquad.getHeros().size());
	}

	@Test public void addHero_addsHeroToList_true() {
		Squad testSquad = new Squad("The Gits", 5, "To fight for the onliners");
		Hero testHero = new Hero("Hero", 12);
		testSquad.addHero(testHero);
		assertTrue(testSquad.getHeros().contains(testHero));
	}
}