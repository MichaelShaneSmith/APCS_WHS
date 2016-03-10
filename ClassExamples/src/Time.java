
public class Time 
{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time()
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public Time(int h, int m, int s)
	{
		hours = h;
		minutes = m;
		seconds= s;
	}
	
	public int getHour()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	
	public void setHour(int h)
	{
		addHours(h);
	}
	
	public void setMinutes(int m)
	{
		addMinutes(m);
	}
	
	public void setSeconds(int s)
	{
		addSeconds(s);
	}
	
	public void addHours(int h)
	{
		int a = (hours+h);
		if((a)>24)
			{
				int b = a/24;
				int c = a-(b*24);
				hours = c;
			}
		else
		{
			hours = a;
		}
			
	}
	
	public void addMinutes(int m)
	{
		int a = (minutes+m);
		if(a>=60)
			{
				int b = a/60;
				int c = a-(b*60);
				minutes = c;
				
				int d = hours + b;
				if(d>24)
				{
					int e = d/24;
					int f = d-(e*24);
					hours = f;
				}
				else
					hours = d;
			}
		else
		{
			minutes = a;
		}
			
	}
	
	public void addSeconds(int s)
	{
		//seconds += s;
		//addMinutes(seconds/60);
		//seconds %= 60;
		
		
		int g = seconds+s;
		if(g>=60)
		{
			int h = g/60;
			int i = g-(h*60);
			seconds = i;
			
			int a = (minutes+h);
			if(a>=60)
				{
					int b = a/60;
					int c = a-(b*60);
					minutes = c;
					
					int d = hours + b;
					if(d>24)
					{
						int e = d/24;
						int f = d-(e*24);
						hours = f;
					}
					else
						hours = d;
				}
			else
			{
				minutes = a;
			}
			
		}
		else
			seconds = g;
	}
	
	
	public String toString()
	{
		return hours + ":" + minutes + ":" + seconds;
	}
}
