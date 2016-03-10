
public class OrderedPair 
{
	private double domain;
	private double range;
	
	public OrderedPair()
	{
		domain = -999;
		range = -999;
	}
	
	public OrderedPair(double d, double r)
	{
		domain = d;
		range = r;
	}
	
	public double getDomain()
	{
		return domain;
	}
	
	public double getRange()
	{
		return range;
	}
	
	public void setDomain(double d)
	{
		domain = d;
	}
	
	public void setRange(double r)
	{
		range = r;
	}
	
	public double getSlope(OrderedPair other)
	{
		if((other.getDomain()-domain !=0))
		{
			return (other.getRange()- range)/(other.getDomain()-domain);
		}
		
		System.out.println("Slope undefined!");
		return -1;
	}
	
	public OrderedPair getMidPoint(OrderedPair other)
	{
		// make something to hold the answer
		OrderedPair MP = new OrderedPair();
		
		// fill it with correct numbers
		MP.setDomain( (domain + other.getDomain())/ 2.0);
		MP.setRange((range + other.getRange())/ 2.0);
		// send it back
		return MP;
	}
	
	public double getDistance(OrderedPair other)
	{
		return Math.sqrt(Math.pow((other.getDomain()- domain), 2) + Math.pow(other.getRange()- range, 2));
	}
	
	public String toString()
	{
		return "(" + domain + ", " + range + ")";
	}
	
}
