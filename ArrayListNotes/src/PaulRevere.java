import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class PaulRevere 
{
	
	private static ArrayList <word> Poem = new ArrayList <word>();
	private static String [] words;
	private static int c;


	
	public static void run()
	{  
		Scanner f = null;
		
		try 
		{
			f = new Scanner(new File("//wyom-san//students//2014//214134//AP Comp Sci//workspace//ArrayListNotes//src//Demo.txt"));
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Yo! The file be missing, son!");
			System.exit(0);
		}
		
		int z = 0;
		
		while(f.hasNextLine())
		{

		   
		    String line = f.nextLine().toLowerCase();
		    line=line.replaceAll("[,.!:\"';?]", "");
		   if(!line.equals(""))
		   {
		    z++;
		    split(line);
			dothething(z);
		   }
		    
			
		}
		//tidy();
		printArray();
		f.close();
	}
	
	public static void cleanUp()
	{
		for(int x = 0; x<words.length; x++)
		{
			System.out.println("checking:"+words[x]);
			
			if(words[x].indexOf(",") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].substring(0, words[x].indexOf(","));
			}
			
			if(words[x].indexOf(".") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].substring(0, words[x].indexOf("."));
			}
			
			if(words[x].indexOf(";") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].substring(0, words[x].indexOf(";"));
			}
			
			if(words[x].indexOf("\"") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].substring(words[x].indexOf("\"")+1);
				//words[x] = words[x].replaceAll("\"", "");
			}
			
			if(words[x].indexOf("\"") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].replaceAll("\"", "\"");
			}
			
			if(words[x].indexOf("!") != -1)
			{
				//System.out.println(1);
				words[x] = words[x].replaceAll("!", "");
			
			}
			
			System.out.println("["+words[x]+"]");
			
		}

	}
	
	public static void dothething(int z)
	{		
		int x=0;
	    if(Poem.size()==0)
	    {
	    	Poem.add(new word(words[0]));
			Poem.get(0).addline(z);
			Poem.get(0).count();
			x++;
			//count++;
	    }
	   
		    while(x<words.length)
		    {
		    	int i=0;
		    	boolean done = false;
		    	while(!done && i<Poem.size())
		    	{
		    		if(words[x].compareToIgnoreCase(Poem.get(i).getString())==0)
		    		{
		    			Poem.get(i).count();
						Poem.get(i).addline(z);
						
						done = true;
						//System.out.println("Updating " + words[x]);
		    		}
		    		else if(words[x].compareToIgnoreCase(Poem.get(i).getString())<0)
		    		{
		    			Poem.add(i, new word(words[x]));
						Poem.get(i).count();
						Poem.get(i).addline(z);
						
						done = true;
						//System.out.println("Add " + words[x]);
		    		}
		    		else 
		    			i++;
		    		

		    	}
		    	
		    	if(!done)
	    		{
	    			Poem.add(new word(words[x]));
					Poem.get(Poem.size()-1).count();
					Poem.get(Poem.size()-1).addline(z);
	    		}			    	
		    	
		    	x++;  
	    }
	}
	
	public static void split(String line)
	{
		words = line.split(" ");
		//cleanUp();
	}
	
	public static void printArray()
	{
		System.out.println(Poem);
	}
	
	public static void tidy()
	{
		Poem.remove(0);
	}
	
	public static int wordCount()
	{
		int temp=0;
		for(int x=0; x<Poem.size(); x++)
		{
			temp= temp + (Poem.get(x).getCount());
		}
		return temp;
	}
	
	public static int characterCount()
	{
		int c=4;
		for(int x=0; x <= Poem.size()-1; x++)
			c = c + ((Poem.get(x).getCount()) * (Poem.get(x).getString().length()));
		return c;
	}
	
	public static void readingLevel()
	{
		System.out.println("Reading Difficulty: "+(double)characterCount()/(double)wordCount());
	}
	
	public static void main(String[] args) 
	{
		run();
		wordCount();
		//System.out.println("Words = "+count);
		System.out.println("Characters = "+characterCount());
		System.out.println("Words: "+wordCount());
		readingLevel();
	}
	
	

}

/*Assignment:

Paul Revere

Also, provide the following:
      -A total word count
      -The Reading-difficulty level (# of letters / # of words)
*/