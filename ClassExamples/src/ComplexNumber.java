
public class ComplexNumber 
{
	private int real;
	private int imaginary;
	
	public ComplexNumber()
	{
		real = -999;
		imaginary = -999;
	}
	
	public ComplexNumber(int r, int i)
	{
		real = r;
		imaginary = i;
	}
	
	public int getReal()
	{
		return real;
	}
	
	public int getImaginary()
	{
		return imaginary;
	}
	
	public void setReal(int r)
	{
		real = r;
	}
	
	public void setImaginary(int i)
	{
		imaginary = i;
	}
	
	public ComplexNumber add(ComplexNumber other)
	{
		ComplexNumber CP1 = new ComplexNumber();
		CP1.setReal(real+other.getReal());
		CP1.setImaginary(imaginary+other.getImaginary());
		return CP1;
	}
	
	public ComplexNumber subtract(ComplexNumber other)
	{
		ComplexNumber CP1 = new ComplexNumber();
		CP1.setReal(real-other.getReal());
		CP1.setImaginary(imaginary-other.getImaginary());
		return CP1;
	}
	
	public ComplexNumber multiply(ComplexNumber other)
	{
		ComplexNumber CP1 = new ComplexNumber();
		CP1.setReal((real*other.getReal()) - (imaginary*other.getImaginary()));
		CP1.setImaginary((real*other.getImaginary()) + (imaginary*other.getReal()));
		return CP1;
	}
	
	public String toString()
	{
		return real+"+"+imaginary+"i";
	}
}
