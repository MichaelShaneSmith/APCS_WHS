
public class Searches 
{
	//private static int [] list = {1,2,3,4,5,6,7,8,9};
	private static Hero [] list = new Hero[3];
	
	
	private static Comparable bin(Comparable target)
	{
		int alpha=0;
		int omega = list.length-1;
		
		while(alpha<=omega)
		{
			// find middle
			int mid = (alpha + omega) / 2;
			
			// compare to target, low high equal
			// adjust window
			if(list[mid].compareTo(target)==0)
			{
				//return mid;
				return list[mid];
			}
			else if(list[mid].compareTo(target)<0)
			{
				alpha = mid+1;
			}
			else
			{
				omega = mid-1;
			}
		}
		
		System.out.println("Item Not Found");
		return -1;
		
	}
	
	public static void main(String[] args) 
	{
		list[0] = new Hero("Batman","Bruce Wayne","Money");
		list[1] = new Hero("Spiderman","Peter Parker","Mutation");
		list[2] = new Hero("Green Lantern","Hal Jordan","Willpower");
		
		Hero temp = new Hero();
		temp.setName("Batwoman");
		
		System.out.println(bin(temp));
		

	}

}

/*Assignment:  Use the file movies.csv found on the student drive to create a program that searches the top 400 movies of all time.  The user should choose what value they want to search by from a simple menu:

What do you want to search?
1. ranking
2. name
3. year
4. gross amount
Choose one:

Once searched, if the movie is found, the program should display all of the information regarding that movie.  For example:

What do you want to search?
1. ranking
2. name
3. year
4. gross amount
Choose one:  2

Search by what name:  The Dark Knight

Results:
The Dark Knight
2008
$1,001,921,825

Tricks and Tips:  
-Read the entire data file into a data structure (array/ArrayList).  
-Take each line and separate it so that you can easily find the individual values*/