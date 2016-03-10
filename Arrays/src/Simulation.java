

public class Simulation 
{
	static Locker [] hallway = new Locker [100];
	
	public static void initialize()
	{
		//System.out.println(" ");
		System.out.println("Ante Simulation: ");
		for(int i=1;i<=hallway.length;i++)
		{
			hallway[i-1] = new Locker();
			
			System.out.println(i + " " +hallway[i-1]);
		}
	}

	public static void run()
	{
		System.out.println(" ");
		System.out.println("Post Simulation: ");
		for(int y=1; y<=hallway.length; y++)
		{
			for(int x = 1; x<=(hallway.length); x++)
			{
				if(x%y==0)
				{
					hallway[x-1].changeState();
				}		
			}
			System.out.println(y + " " +hallway[y-1]);
		}
	}
	
	public static void leftOpen()
	{
		System.out.println(" ");
		System.out.println("Lockers Left Open: ");
		for(int x=0; x<hallway.length; x++)
		{
			if(hallway[x].isOpen() == true)
			{
				System.out.println((x+1)+" "+hallway[x]);
			}
				
		}
	}
	
	public static void touchedMost()
	{
		System.out.println(" ");
		System.out.println("Touched Most: ");
		int max = hallway[1].timesTouched();
		
		for(int y=1; y<hallway.length-1; y++)
		{
			for(int x = 1; x<(hallway.length); x++)
			{
				max = Math.max(max,hallway[x].timesTouched());	
			}
		}
		
			for(int x = 1; x<(hallway.length); x++)
			{
				if(max==hallway[x].timesTouched())
				{
					System.out.println((x+1)+" "+hallway[x]);
				}
			}
		
	}
	
	public static void touchedTwice()
	{
		System.out.println(" ");
		System.out.println("Touched Twice: ");
			for(int x = 1; x<(hallway.length); x++)
			{
				if((hallway[x].timesTouched())==2)
				{
					System.out.println(x+" "+hallway[x]);
				}
			}
	}
	
	public static void report()
	{
		leftOpen();
		touchedMost();
		touchedTwice();
	}

	public static void main(String[] args) 
	{
		initialize();
		run();
		report();
	}
}
