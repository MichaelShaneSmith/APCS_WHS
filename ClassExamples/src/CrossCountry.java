
public class CrossCountry 
{
	private double minutes;
	private double seconds;
	private double goal;

	
	public CrossCountry()
	{
		minutes = 0;
		seconds = 0;
		goal = 0;
		
	}
	
	public CrossCountry(double h, double m, double g)
	{
		minutes = h;
		seconds = m;
		goal = g;
	}
	
	public double getHour()
	{
		return minutes;
	}
	
	public double getMinutes()
	{
		return seconds;
	}
	
	public double getGoal()
	{
		return goal;
	}
	
	public void setMinutes(double m)
	{
		minutes = m;
	}
	
	public void setSeconds(double s)
	{
		seconds = s;
	}
	
	public void setGoal(double g)
	{
		goal = g;
	}
	
	public void addMinutes(double m)
	{
		minutes +=m;
	}
	
	public void addSeconds(double s)
	{
		seconds +=s;
		addMinutes(seconds/60);
		seconds %=s;
	}
	
	public boolean goalReached()
	{
		if(minutes<goal)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return minutes + ":" + seconds;
	}
}
