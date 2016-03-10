
public class ArrayNotes 
{

	public static void main(String[] args) 
	{
	
		/*Built-in Array
		 a contiguous collection 
		 of the SAME type of data*/
		
		// How do we make them?
		int [] numList = new int[10];
		
		System.out.println(numList);
		
		// How do we fill it?
		numList[4] = 42;
		
		// How to get stuff out?
		int a = numList[4];
		
		// How to print out?
		for (int i=0;i<numList.length; i++)
		{
			System.out.println(numList[i]+" ");
		}
		
		// Other types
		double [] price = new double[25];
		char [] alpha = new char[56];
		String [] names = new String[12];
		boolean [] used = new boolean[10];
		
		Fraction [] nums = new Fraction[3];
		
		// You must initialize before use
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = new Fraction();
			System.out.println(nums[i]);
		}
		
		nums[0].setNumerator(5);
		nums[0].setDenominator(12);
		
		// ArrayIndexOutofBoundsException
		//nums[4].setNumerator(3);
		//nums[9].setNumerator(12);
		
		System.out.println(nums[0]);
		
		System.out.println(nums[nums.length-1]);
		
		//System.out.println(nums[-1]);  DNE
		
		// Typical Algorithms
		
		int [] numbers = {10, 3, 5, 4, 7, 2, 9, 1, 6, 8};
		
		//Find minimum
		
		int min = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]<min)
				min= numbers[i];
		}
		
		System.out.println("The smallest is: "+ min);
		
		// Find Max
		int max = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>max)
				max = numbers[i];
		}
		
		System.out.println("The largest is: "+ max);
		
		// Find Average 
		
		int sum = 0;
		
		for(int i=1;i<numbers.length;i++)
		{
			sum = sum + numbers[i];
			
		}
		
		System.out.println("The Average is: "+ ((double)sum/numbers.length));
		
		// Sort
		// Show
		
		
		
		
		
		
		//MultiDimensional Arrays
		
		int [][] grid = new int[3][5];
		
		System.out.println(grid);
		
		grid[0][0] = 5;
		grid[2][4] = 9;
		
		int b = grid[2][4];
		System.out.println(b);
		
		
		
		for(int x=0; x<grid.length; x++)
		{
			for(int y=0; y<grid[x].length; y++)
			{
				System.out.print(" "+grid[x][y]+" ");
			}
			System.out.println();
		}
		
		double[][] prices = new double[2][50];
		String[][] name = new String[2][13];
		
		System.out.println((char)83);
	}

}
