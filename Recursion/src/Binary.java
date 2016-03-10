
public class Binary 
{
	
	public static void binary(int n)
	{
		if(n==0)
		{
			
			System.out.println("In Binary: ");
		}
		else
		{
			binary(n/2);
			System.out.print((n%2));
		}	
	}
	
	
	public static void main(String[] args) 
	{
		binary(42);
	}

}
