
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpiralBug extends Bug
{
	private int steps;
	private int sideLength;
	
	public SpiralBug()
	{
		steps = 0;
		sideLength = -10;
	}
	
	public void act()
	{
		if(steps < sideLength && canMove())
		{
			move();
			steps++;
		}
		else
		{
			//turn();
			setDirection(getDirection() + 90);
			sideLength++;
			steps = 0;
		}
	}
}
