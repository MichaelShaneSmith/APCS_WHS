
public class RecursionNotes 
{

	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void countDown(int n)
	{
		if(n==0)
			System.out.println("Turn Up!!!");
		else
		{
			System.out.println(n);
			countDown(n-1);
		}
	}
	
	public static void main(String[] args) 
	{
		// recursion
		// creating a method that calls itself
		// in order to solve increasingly smaller 
		// versions of the same problem
		
		// example 1 - tail end recursion
		// work is done after the recursive call
		
		System.out.println(factorial(4));
		
		// example 2 - non-tail end recursion
		// work is done within the call itself
		
		countDown(10);
	}

}

/*Recursive Program Assignments 
Target due date:  the end of the week!


You must choose the following:
1.  either Fibonacci or Pascal
2.  either Reverse or Commas
3.  You must do Binary Conversion

Binary Conversion 
Write a recursive program to convert a decimal number to a binary number.
Binary B = new Binary();
System.out.println(B.toBinary(42));
// should print 101010*/



