
public class Temperature 
{
	private double degrees;
	private char units;
	
	public Temperature()
	{
		degrees = -273;
		units = 'R';
	}
	
	public Temperature(double d, char u )
	{
		degrees = d;
		units = u;
	}
	
	public double getDegrees()
	{
		return degrees;
	}
	
	public char getUnits()
	{
		return units;
	}
	
	public void setDegrees(double d)
	{
		degrees = d;
	}
	
	public void setUnits(char u)
	{
		units = u;
	}
	
	//  helper - doesn't fit other definitions
	public Temperature convertFtoC()
	{
		if(units=='F' || units=='f')
		{
			Temperature T = new Temperature();
			T.setDegrees((5./9)*(degrees-32));
			T.setUnits('C');
			return T;
		}
		return new Temperature(degrees,units);
	}
	
	public Temperature convertCtoF()
	{
		if(units=='C' || units=='c')
		{
			Temperature T = new Temperature();
			T.setDegrees((9./5)*degrees + 32);
			T.setUnits('F');
			return T;
		}
		return new Temperature(degrees,units);
	}
	
	public String toString()
	{
		return "" + degrees+" "+ units;
	}
}
