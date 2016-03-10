import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
	private int steps;
	private boolean done;
	private int counter;
	
	public ZBug(int n)
	{
		steps = n-1;
		done = false;
		counter = 0;
		setDirection(90);
	}
	
	private void action()
	{
		for(int i = steps; i >0; i--)
		{
			move();
		}
	}
	
	public void act()
	{
		if(done==false && canMove() && getDirection()==90)
		{
			action();
			setDirection(225);
			counter++;
			
		}
		else
			if(done==false && canMove() && getDirection()==225)
			{
				action();
				setDirection(90);
				counter++;
			}
		
		if(counter==3)
		{
			done=true;
			setDirection(90);
		}
			
		
	}
}
