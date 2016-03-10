
public class Coins 
{
	private int coins;
	
	public Coins()
	{
		coins = -0;
	}
	
	public Coins(int c)
	{
		coins = c;
	}
	
	public int getCoins()
	{
		return coins;
	}
	
	public void setCoins(int c)
	{
		coins = c;
	}
	
	public int getNumQuarters()
	{
		return coins/25;
	}
	
	public void getNumDimes()
	{
		int D = coins/10;
		if(D==1)
			System.out.println(D +" Dime");
		else
			System.out.println(D +" Dimes");
	}
	
	public void getNumNickels()
	{
		int N = coins/5;
		if(N==1)
			System.out.println(N +" Nickel");
		else
			System.out.println(N +" Nickels");;
	}
	
	public void getNumPennies()
	{
		int P = coins/1;
		if(P==1)
			System.out.println(P +" Penny");
		else
			System.out.println(P +" Pennies");
	}
	
	public void getBreakdown()
	{
		int a = coins/25;  // a = number of quarters
		int b = coins - (a*25);   // b=a%25;
		
		int c = b/10;  // c = # of dimes from the remaining
		int d = b - (c*10);
		
		int e = d/5;  // e = # of nickels from remaining
		int f = d - (e*5);  // the rest should be pennies
		System.out.println(a+" Quarters, "+c+" Dimes, "+e+" Nickels, and "+f+" Pennies");
		
	}
	
	public String toString()
	{
		return ""+coins;
	}
}
