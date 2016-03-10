
public class movie implements Comparable
{
	private String title;
	private String year;
	private long gross;
	private int rank;
	
	public movie()
	{
		title = "";
		year = "";
		gross = 0;
		rank = 0;
	}
	
	public movie(Object g)
	{
		this();
		title = (String) g;
		
	}
	
	public movie(String t, String y, String g, int r)
	{
		title = t;
		year = y;
		gross = Long.parseLong(g);
		rank = r;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public void setYear(String y)
	{
		year = y;
	}
	
	public void setGross(String g)
	{
		gross = Long.parseLong(g);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public long getGross()
	{
		return gross;
	}
	
	public int compareTo(Object temp)
	{
		/*long g = Long.parseLong(gross);
		long m = Long.parseLong(((movie) temp).getGross());*/
		if(gross == ((movie) temp).getGross())
			return 0;
		else if(gross > ((movie) temp).getGross())
			return 1;
		else 
			return -1;
		
		//return gross.compareTo(((movie) temp).getGross());
	}
	
	public String toString()
	{
		return "#"+rank+" "+title+" ("+year+")  $"+gross+"\n";
	}
}
