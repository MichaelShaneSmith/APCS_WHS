import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListNotes 
{

	public static void main(String[] args) 
	{
		// ArrayList library class
		// similar to Array, but has a DYNAMIC SIZE
		// method: size(), add(), remove(), contains(), clone()
		// part of Java's utility library
		
		// import java.util.Arraylist;
		
		// <....> Generics
		ArrayList <Hero> herolist = new ArrayList <Hero>();
		
		// print
		System.out.println(herolist);
		
		herolist.add(new Hero("Superman", "Clark Kent", "All"));
		herolist.add(new Hero("Batman", "Bruce Wayne", "$$$$$"));
		herolist.add(new Hero("Spiderman", "Peter Parker", "Spideryness"));
		herolist.add(2, new Hero("Squirrel Girl", "Doreen Green", "Talks to squirrels"));
		
		System.out.println(herolist);
		System.out.println(herolist.size());
		
		System.out.println(herolist.get(1));
		Hero temp = herolist.get(0);
		System.out.println(temp);
	
		//temp = herolist.get(4);
		//java.lang.IndexOutOfBoundsException
		System.out.println(temp);
		
		Hero Next = new Hero("Aquaman", "Arthur Curry", "Fish Stuff");
		herolist.add(Next);
		
		System.out.println(herolist.contains(Next));
		System.out.println(herolist.contains(new Hero("Aquaman", "Arthur Curry", "Fish Stuff")));
		// different memory addresses!!!!!
		
		// remove?
		herolist.remove(1);
		herolist.remove(Next);
		System.out.println(herolist);
		
		herolist.set(0,Next);
		System.out.println(herolist);
		
		herolist.get(0).setAbility("Hard to Drown");
		
		int i = herolist.indexOf(new Hero());
		System.out.println(i);
		
		if(i>=0)
		{
			herolist.get(i).setName("The Crimson Chin");
		}
		
		// issues
		//ArrayList <double> nums = new ArrayList<double>();
		ArrayList <Integer> nums = new ArrayList<Integer>();
		
		nums.add(42);	// auto-boxing or auto-wrapping
		//nums.add(new Integer(42));
		System.out.println(nums);
		
		int n = nums.get(0);
		System.out.println(n);
		
		// traversal
		for(Hero h: herolist)
		{
			System.out.println(h);
		}
		
		// The Iterator
		
		for(ListIterator<Hero> itr = herolist.listIterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
		ListIterator <Hero> itr = herolist.listIterator();
		temp = itr.next();
		System.out.println(temp);
		itr.remove();	// removes object pointed at by itr
		System.out.println(herolist);
		// itr.remove();  java.lang.IllegalStateException
		System.out.println(herolist);
		itr.next();
		itr.remove();
		System.out.println(herolist);
		
		// can start back at the beginning
		
		
		
	}

}
