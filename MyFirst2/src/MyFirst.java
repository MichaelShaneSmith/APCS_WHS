import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaDoc comment
 * @author 214134
 *
 */

											// single line comment

											// public - files outside have access
											// class - building block of OOP
											// MyFirst - class name, same as file name
public class MyFirst 
{  											
											//left curly-brace, start of a group of code
											// public - full access
											// static - only one allowed
											// void - sends nothing back to the calling program
											// main - standard name for starting method
											// purple - reserved or key word
											// () - parenthesis, used on method call ie .getAge()
											// String - library holds multiple characters
											// [] - square brackets, an array of info (list)
											// args - name of the array	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Hello World!"); // String literal
		System.out.print("Hello");
		System.out.print("World");
		System.out.println();
		System.out.println();
		System.out.println("Wyoming HS");
		System.out.println(362436);
		System.out.println(22/7);           // int div int gives int
		System.out.println(3.00/4);
		System.out.println('Q');  			// char - single letter, number or symbol
		System.out.println("Q"); 			// String 
		
		int Q = 42; 						// define a variable, assignment 
		System.out.println(Q);
		
		double cost = 29.95;				// double - decimals
		System.out.println(cost);
		
		boolean sunk = false;				// boolean - true or false
		System.out.println(sunk);
		
		char middleInitial = 'W';
		System.out.println(middleInitial);
		
		String name = "George";				// Library Data Type
		System.out.println(name);
		
		System.out.println(3+5);			// 8
		System.out.println("3+5");			// 3+5
		System.out.println(3-5);			// -2
		System.out.println(3*5);			// 15
		System.out.println(3/5);			//0.6
		
		System.out.println(2+3*5);			// PEMDAS
		
		System.out.println("3" + "5");		// concatenate
		System.out.println('3' + '5');		// ASCII codes
		
		// System.out.println(5/0);			// run-time exception, / by zero
		
		System.out.println(6.0-5.99);		// round-off error!
		System.out.println(7%2);			// mod symbol - the remainder of integer divisions
		System.out.println(7%3);
		System.out.println(7%4);
		
		System.out.println(100000 * 100000);// overflow
		
		System.out.println("The answer is " + 42);// concatenate
		System.out.println("The answer is " + 42 + 10);
											// primitive is lower case, object is upper case
		int x;
		int x2;
		//int 2x;
		int X;
		int age, height;
		
		int firstname;
		System.out.println("George \"Babe\" Ruth");// escape sequence - \"  \t  \n  \\
		System.out.println("Ob\nama\"Based\tgo\\d");
		
		// sequential programming
		
		
		int num = 8;
											// postcondition: decide even or odd
											// decision statement
		if(num%2==0)						// boolean test in ()
		{
			// if true, do this part
			// if false, skip this part
			System.out.println(num + " is even");
		
		}
		else
			{
											// if false, do this part
											// indent shows dependency to previous item
			System.out.println(num + " is odd");
			}
		
		double price = 19.95;
		boolean buyIt = false;
		
		if(price <= 19.95)
			buyIt = true;
		else
			buyIt = false;
		
		int r=25, s=17, t=9;
		
											// short-circuit evaluation
											// if r>s fails, it doesn't do the rest
		if(r>s && r>t)						// compound test
			{
				System.out.println(r + " is the biggest");
			}
		else
			{
											// nested statements
											// and is &&
											// or is ||
			if(t>r && t>s)
				{
					System.out.println(t + " is the biggest");
				}
			else
				{
				System.out.println(s + " is the biggest");
				}
			
			// DeMorgan' s Laws
			
			// !(A && B) same as !A || !B
			// !(A || B) same as !A && !B
			
			char answer = 'b';
				if(answer=='a')
					System.out.println("you lose");
				else if(answer=='b')
					System.out.println("you win");
				
			
			}
	
		// repetition statement
		// three parts: initialize, test, change
		
		// pre-test loop
		// minimum number of repetitions? 0
		// max? until the end of time
		
		for(int i = 0; i<100; i++)
		{
			System.out.print(" counter = " + i);
			
		}
		System.out.println();
		
		
		for(int j=0; j<100; j+=2)
		{
			System.out.print(" j = " + j);
		}
		System.out.println();
		
		// print odd from 1 to 101 inclusive
		
		for(int k=1; k<=101; k+=2 )
		{
			System.out.print(k + " " );
		}
		
		
		for(char let = 'a'; let <='z';let++)  
		{
			System.out.print(let);
		}
		
		int q=0;
		
		while(q<100)
		{
			System.out.println("q = " + q);
			q++;
		}
		
		BufferedReader in 
			= new BufferedReader(new InputStreamReader(System.in));
		
		boolean done = false;
		
		while(done == false)
		{
			System.out.println("Keep Looping? ");
			String ans = in.readLine();
			
			if(ans.equals("no"))
				done = true;
		}
		
		
		// post-test loop
		
		// do...while loop
		
		String response = "";
		
		do
		{
			System.out.println("Enter your Password: ");
			response = in.readLine();
		}
		while(!response.equals("1234"));
		
		
		
	}
}  											// right curly-brace, end of a group of code
