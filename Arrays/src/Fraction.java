
public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		numerator = -999;
		denominator = -999;
	}
	
	public Fraction(int n, int d)
	{
		numerator = n;
		denominator = d;
		reduce();
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void setNumerator(int r)
	{
		numerator = r;
		reduce();
	}
	
	public void setDenominator(int i)
	{
		denominator = i;
		reduce();
	}
	
	// add
	
	public Fraction add(Fraction other)
	{
		Fraction F = new Fraction();
		
		int cd = denominator * other.getDenominator();
		int n1 = numerator * other.getDenominator();
		int n2 = other.getNumerator() * denominator;
		
		F.setDenominator(cd);
		F.setNumerator(n1+n2);
		return F;
	}
	
	// subtract
	
	public Fraction subtract(Fraction other)
	{
		Fraction F = new Fraction();
		
		int cd = denominator * other.getDenominator();
		int n1 = numerator * other.getDenominator();
		int n2 = other.getNumerator() * denominator;
		
		F.setDenominator(cd);
		F.setNumerator(n1-n2);
		return F;
	}

	
	// multiply
	
	public Fraction mulitply(Fraction other)
	{
		Fraction F = new Fraction();
		F.setNumerator(numerator * other.getNumerator());
		F.setDenominator(denominator * other.getDenominator());
		return F;
	}
	// divide
	
	public Fraction divide(Fraction other)
	{
		Fraction F = new Fraction();
		F.setNumerator(numerator * other.getDenominator());
		F.setDenominator(denominator * other.getNumerator());
		return F;
	}
	
	// reduce
	
	private void reduce()
	{
		for(int y = Math.min(Math.abs(numerator), Math.abs(denominator)); y>=2; y--)
		{
		//  if both divisible
			if(numerator%y==0 && denominator%y==0)
			{
				// divide
				numerator/=y;
				denominator/=y;
				return;
			}
		}
			// reduce();  // cause stack overflow error
	}
	
	
	
	public String toString()
	{
		return numerator+"/"+denominator;
	}
}
