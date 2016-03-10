import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
	private int steps;
	private int sideLength;
	private int[] array;
	private int position;
	private int turns;
	
	public DancingBug(int[] a)
	{
		steps = 0;
		sideLength = 0;
		array = a;
		position = 0;
		turns = array[position];
	}
	
	public void act()
	{
		
		if(turns == 0)
		{
			super.act();
			
			if(position == array.length-1)
				position = 0;
			else
			{
				position++;
				turns = array[position];
			}
				
		}	
		else
		{
			turn();
			turns--;
		}
	}
}
