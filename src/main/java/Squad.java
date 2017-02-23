import java.util.*;

public class Squad {
	// properties
	private String mName;
	private int mMaxsize;
	private String mObjective;
	private int mId;

	private static List<Squad> squads 	= new ArrayList<Squad>();
	private static List<Hero> heros;

	public Squad(String name, int size, String objective) {
		mName 		= name;
		mMaxsize 	= size;
		mObjective 	= objective;
		squads.add(this);
		mId 		= squads.size();
		heros 		= new ArrayList<Hero>();
	}
	// return the name of squad
	public String getName() {
		return mName;
	}
	// return the max-size of each squad
	public int getSize() {
		return mMaxsize;
	}
	// return the objective of squad
	public String getObjective() {
		return mObjective;
	}
	// list all the squads
	public static List<Squad> getSquads() {
		return squads;
	}
	// clear the list
	public static void clear() {
		squads.clear();
	}
	// get item id
	public int getId() {
		return mId;
	}
	// find a specific squad
	public static Squad findSquad(int id) {
		return squads.get(id - 1);
	}
	// get all task for a category
	public List<Hero> getHeros() {
		return heros;
	}
	// add hero to suad
	public void addHero(Hero hero) {
		heros.add(hero);
	}
}