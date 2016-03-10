
public class SortsNotes 
{
	static Comparable [] list = new Comparable[9];
	
//////////////////////////////////////////////////////////////////////////
	
	private static void bubbleSort()
	{
		boolean sorted = true;
		do
		{
			sorted = true;
			for(int i=0; i<list.length-1; i++)
			{
				if(list[i].compareTo(list[i+1])>0)
				{
					swap(i,i+1);
					sorted = false;
				}
			}
		}
		while(!sorted);
	}
	
	private static void swap(int x, int y)
	{
		Comparable temp = list[x];
		list[x] = list[y];
		list[y] = temp;
	}
	
	private static void show()
	{
		for(Comparable x: list)
			System.out.print(x);
		System.out.println();
	}
	
//////////////////////////////////////////////////////////////////////////
	
	private static void selectionSort()
	{
		for(int i=0; i<list.length; i++)
		{
			swap(i, minLoc(i));
		}
	}
	
	private static int minLoc(int start)
	{
		Comparable min = list[start];
		int loc = start;
		
		for(int i = start+1; i<list.length; i++)
		{
			if(list[i].compareTo(min)<0)
			{
				min = list[i];
				loc = i;
			}
		}
		
		return loc;
	}
	
/////////////////////////////////////////////////////////////////////////
	
	public static void insertionSort()
	{
		// find loc of min/max value
		// take min/max out of list
		// slide prev item into min/max loc
			//repeat with each prev item slide up 1
		// once target pos vacated, replace with min/max
		//repeat
		
		for(int x=0; x<list.length; x++)
		{
			int loc = minLoc(x);
			Comparable temp = list[loc];
			
			for(int v=loc; v>x; v--)
			{
				list[v] = list[v-1];
			}
			
			list[x] = temp; 
		}
	}

	//////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) 
	{
		// Bubble O(n^2)
		// Selection O(n^2)
		// Insertion O(n^2)
		// Merge
		// Quick
		
		list[0] = new Integer(6);
		list[1] = new Integer(2);
		list[2] = new Integer(9);
		list[3] = new Integer(3);
		list[4] = new Integer(5);
		list[5] = new Integer(1);
		list[6] = new Integer(8);
		list[7] = new Integer(4);
		list[8] = new Integer(7);
		
		show();
		
		//bubbleSort();
		//selectionSort();
		//insertionSort();
		MergeSort M = new MergeSort(list);
		M.sort();
		
		show();
		

	}

}
