import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/*  issue:
 * 
 *  1001921825
	968657891
	
	Lexicographically which is bigger?
	  letter by letter!
	    9 is bigger than 1!!!!!
 */

public class Moogle 
{
	private static ArrayList <movie> Database = new ArrayList <movie>();
	public static void initialize()
	{  
		Scanner f = null;
		
		try 
		{
			f = new Scanner(new File("//wyom-san//students//2014//214134//AP Comp Sci//workspace//Searches//src//movies.txt"));
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Yo! The file be missing, son!");
			System.exit(0);
		}
		
		int z = 1;
		
		while(f.hasNextLine())
		{
			String line = f.nextLine();
			
			String title = line.substring(0, line.indexOf("(")-1);
			String year = line.substring(line.indexOf("(")+1, line.indexOf(")"));
			String gross = line.substring(line.indexOf("$")+1, line.length()-2);
			gross = gross.replace(",","");

			if(year.length()>4)
				year = year.substring(0,4);
			
			movie film = new movie(title, year, gross, z);
			Database.add(film);
			z++;
		}
		f.close();
	}
	
	private static Comparable grossSearch(Comparable target)
	{
		movie temp = new movie();
		temp.setGross((String)target);
		
		int alpha=0;
		int omega = Database.size()-1;
				
		while(alpha<=omega)
		{
			int mid = (alpha + omega) / 2;

			if(Database.get(mid).compareTo(temp)==0)
			{
				return Database.get(mid);
			}
			else if(Database.get(mid).compareTo(temp)>0)
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
	
	public static movie titleSearch(String t)
	{
		for(int i=0; i<Database.size(); i++)
		{
			if(Database.get(i).getTitle().equalsIgnoreCase(t))
			{
				return Database.get(i);
			}
		}
		movie temp = new movie("Not Found");
		return temp;
	}
	
	public static movie rankSearch(int r)
	{
		return Database.get(r-1);
	}
	
	public static movie yearSearch(String y)
	{
		for(int i=0; i<Database.size(); i++)
		{
			if(Database.get(i).getYear().equalsIgnoreCase(y))
			{
				System.out.println(Database.get(i));
			}
		}
		movie temp = new movie("Done. The applicable movies have been printed out.");
		return temp;
	}
	
	public static void main(String[] args) 
	{
		initialize();
		int input = Integer.parseInt ( JOptionPane.showInputDialog("Enter a Number\n 1 to Search by Gross\n 2 to Search by Title\n 3 to Search by Rank\n 4 to Search by Year"));
		if(input == 1)
		{
			String grossInput = JOptionPane.showInputDialog("Enter a Number.");
			System.out.println(grossSearch(grossInput));
			JOptionPane.showMessageDialog( null, grossSearch(grossInput));	
		}
		if(input == 2)
		{
			String titleInput = JOptionPane.showInputDialog("Enter a Title.");
			System.out.println(titleSearch(titleInput));
			JOptionPane.showMessageDialog( null, titleSearch(titleInput));
		}
		if(input == 3)
		{
			int rankInput = Integer.parseInt(JOptionPane.showInputDialog("Enter a Rank."));
			System.out.println(rankSearch(rankInput));
			JOptionPane.showMessageDialog( null, rankSearch(rankInput));
		}
		if(input == 4)
		{
			String yearInput = JOptionPane.showInputDialog("Enter a Year.");
			System.out.println(yearSearch(yearInput));
		}
	}

}
