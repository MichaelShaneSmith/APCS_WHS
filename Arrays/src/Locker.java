
public class Locker 
{
	private boolean open;
	private int touches;
	
	public Locker()
	{
		open = false;
		touches = 0;
	}
	
	public Locker(boolean b, int t)
	{
		open = b;
		touches = t;
	}
	
	
	public void changeState()
	{
		if(open == true)
			open = false;
		else
			open = true;
		
		touches ++;
	}
	
	public int timesTouched()
	{
		return touches;
	}
	
	public boolean isOpen()
	{
		if(open == true)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		if(open==true)
			return "Open   " + touches;
		else
			return "Closed " + touches;
	}
}
