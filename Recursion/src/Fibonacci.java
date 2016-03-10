
public class Fibonacci 
{
	public static long fib(long n)
	{
		if(n==1)
			return 1;
		
		if(n==2)
			return 1;
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) 
	{
		for(long x = 1; x<9; x++)
		System.out.println(fib(x));
	}

}
