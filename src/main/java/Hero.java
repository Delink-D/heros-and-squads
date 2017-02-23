import java.util.*;

public class Hero {
	// set properties
	private String mName;
	private int mAge;
	private String mPower;
	private String mWeakness;
	private int mid;

	Random random = new Random();
	private String[] mPowers = {"Computer Geek","Super Fast","Hacker","Night Vision","Mind Control","Time Manipulation"};
	private String[] mmWeaknesses = {"Computer Geek","Super Fast","Hacker"};

	private String randomPower 		=  mPowers[random.nextInt(mPowers.length)];
	private String randomWeakness 	=  mmWeaknesses[random.nextInt(mmWeaknesses.length)];

	private static List<Hero> heros = new ArrayList<Hero>();

	public Hero(String hname, int hage) {
		mName  		= hname;
		mAge 		= hage;
		mPower		= randomPower;
		mWeakness 	= randomWeakness;
		heros.add(this);
		mid 		= heros.size();
	}
	// get hero name
	public String getName() {
		return mName;
	}
	// get hero age
	public int getAge() {
		return mAge;
	}
	// get hero superPower
	public String getPower() {
		return mPower;
	}
	// get hero weakness
	public String getWeakness() {
		return mWeakness;
	}
	// get all heros
	public static List<Hero> getHeros() {
		return heros;
	}
	// clear the list
	public static void clear() {
		heros.clear();
	}
	// get item id
	public int getId() {
		return mid;
	}
	// find a specific hero
	public static Hero findHero(int id) {
		return heros.get(id - 1);
	}
}