import java.util.ArrayList;


public class word 
{
	private String string;
	private int count;
	private ArrayList <Integer> lines = new ArrayList<Integer>();
	
	public word()
	{
		string = "";
		count = 1;
	}
	
	public word(String s)
	{
		string = s;
	}
	
	public String getString()
	{
		return string;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setString(String s)
	{
		string = s;
	}
	
	public void count()
	{
		count ++;
	}
	
	public void addline(int l)
	{
		lines.add(l);
	}
	
	public String toString()
	{
		return string +" "+ count +" "+ lines + "\n";
	}
	
	
}

/*Assignment:

Paul Revere

This program will require some pre-planning. 
Build the skeleton of the program including comments before writing the internal code. 
We will discuss this individually as you work.

After the previous step is approved:

Write an Object-Oriented Java program that examines the poem "The Midnight Ride of Paul Revere" 
(see the file revere.dat) and does the following:

Create an alphabetized word-line index that features
- each word, 
- the number of times it appears in the poem, 
- and the lines on which it appears.

Also, provide the following:
      -A total word count
      -The Reading-difficulty level (# of letters / # of words)

HELPFUL HINT:

You may want to research the .split() method in the String class to break the individual lines of data in to separate words.*/