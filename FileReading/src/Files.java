import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Files 
{

	public static void readFile()
	{
		//Scanner F = new Scanner(System.in);	  
		
		Scanner f = null;
		
		try 
		{
			f = new Scanner(new File("//wyom-san//students//2014/214134//My Documents//revere"));
			// 
			////wyom-san//students//2016//216066//workspace//FileReading//src//Demo.txt
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Yo! The file be missing, son!");
			System.exit(0);
			//e.printStackTrace();
		}
		
		while(f.hasNextLine())
		{
			String line = f.nextLine();
			
			System.out.println(line);
		}
		
		f.close(); // close the file or ????????
	}
	
	public static void main(String[] args) 
	{
		readFile();
	}

}
