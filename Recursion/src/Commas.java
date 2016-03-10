import java.util.ArrayList;


public class Commas 
{
	//static String number;
	//static ArrayList <String> answer = new ArrayList <String>(0);
	
	public static void commas(int n)
	{
		if(n<1000)
		{
			//answer.add(0,n+"");
			System.out.print(n);
			//return n;
		}
		else
		{
			//answer.add(0,(n%1000+""));
			commas(n/1000);
			System.out.print(","+n%1000);
		}
			
	}
	
	public static void main(String[] args) 
	{
		commas(12347575);
	}

}
