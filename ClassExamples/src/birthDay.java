
public class birthDay 
{
	private int month;
	private int day;
	private int year;
	
	public birthDay()
	{
		month = -0;
		day = -0;
		year = -0;
	}
	
	public birthDay(int m, int d, int y)
	{
		month = m;
		day = d;
		year= y;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public void addMonths(int m)
	{
		//month += m;
		//addYears(month/12);
		//month = month%12;
		
		
		
		int a = (month+m);
		if(a>12)
			{
				int b = a/12;
				int c = a-(b*12);
				month = c;
				
				int d = year + b;
					year = d;
			}
		else
		{
			month = a;
		}
	}
	
	public void addDays(int s)
	{
		int g = day+s;
		if(g>31)
		{
			int h = g/31;
			int i = g-(h*31);
			day = i;
			
			int a = (month+h);
			if(a>12)
				{
					int b = a/12;
					int c = a-(b*12);
					month = c;
					
					int d = year + b;
						year = d;
				}
			else
			{
				month = a;
			}
			
		}
		else
			day = g;
	}
	
	public void addYears(int y)
	{
		year += y;
		
		//int newYear = year + y;
		//year = newYear;
	}
	
	public String toString()
	{
		return month + "/" + day + "/" + year;
	}
	
}
