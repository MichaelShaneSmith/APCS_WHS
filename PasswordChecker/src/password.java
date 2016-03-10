import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class password 
{
	private static String password;
	private int total;
	
	public password()
	{
		password = JOptionPane.showInputDialog("Please Enter Your Password.");
		total = 0;
		System.out.println(password);
		readFile();
	}
	
	public int length()
	{
		total = 0;
		readFile();
		
		if(password.length() >= 12)
			return 25;
		else
			return (password.length()*2);
	}
	
	public int characters()
	{
		readFile();
		
		int score = 0;
		int LC = 0;
		int UC = 0;
		int Num = 0;
		int Sym = 0;
		
		for(int x = 0; x < password.length(); x++ )
		{
			if(password.charAt(x)>='a' && password.charAt(x)<= 'z')
				LC++;
				else
					if(password.charAt(x)>='A' && password.charAt(x)<= 'Z')
						UC++;
					else
						if(password.charAt(x)>='0' && password.charAt(x)<= '9')
							Num++;
							else
								Sym++;;
		}						
			if(LC>=1)
				score +=5;
			if(UC>=1)
				score +=7;
			if(Num>=1)
				score +=6;
			if(Sym>=1)
				score +=7;
			
			return score;
		
	}
	
	public int repetition()
	{
		readFile();
		
		int reps = 0;
		String pw = password;
		
		for(int x=0; x<=password.length()-4; x++)
		{
			
			while(pw.length()>=4 && x+4<pw.length())
			{
				String test = pw.substring(x,x+4);
				pw = pw.substring(x+4, pw.length());
				
				
				//System.out.println(test + " in " + pw);
				if(pw.indexOf(test) != -1)
				{
					reps++;				
				}	
			}
			
			pw = password;
		}
		
		//System.out.println(reps);
		
		if(reps<1)
			return 20;
		else
			if(reps==1)
				return 10;
			else
				return 0;
	}
	
	public int patterns()
	{
		int score = 20;
		String pw = password;
		
		for(int x=0; (pw.substring(0,pw.length()-x)).length() >= 4; x++)
		{
			// System.out.println(pw.substring(0,pw.length()-x));
			for(int y=0; (pw.substring(y,pw.length()-x)).length() >=4; y++)
			{
				//System.out.println(pw.substring(y,pw.length()-x));
				String test = pw.substring(y,pw.length()-x);
				if(isPattern(test)== true)
				{
					if(patternLength(test)>= (((pw.substring(y,pw.length()-x)).length())/2))
					{
						score = 0;
						return score;
					}
					
					if(patternLength(test) < (((pw.substring(y,pw.length()-x)).length())/2) && patternLength(test) >0)
					{
						score = 10;
						return score;
					}
				}
					
				
			}
		}
		return 20;
	}
	
	public int common()
	{
		
		
	}
	
	public void checkStrength()
	{
		readFile();
		total = 0;
		JOptionPane.showMessageDialog( null, "Score: " + (length() + characters() + patterns()+repetition()));
		
	}
	
	private boolean isPattern(String pw)
	{
		
		int incPattern = 0;
		int decPattern = 0;
		for(int x=0; x < (pw.length()-1); x++)
		{
			String test = pw.substring(x,(x+2));
			//System.out.println(test);
			
			if(test.charAt(0)+1 == test.charAt(1))
				incPattern++;
			if(test.charAt(0)-1 == test.charAt(1))
				decPattern++;
		}
		//System.out.println(incPattern);
		//System.out.println(decPattern);
		
		if(incPattern >= 3 || decPattern >= 3)
			return true;
		else
			return false;
	}
	
	private int patternLength(String pw)
	{
		
		int incPattern = 0;
		int decPattern = 0;
		for(int x=0; x < (pw.length()-1); x++)
		{
			String test = pw.substring(x,(x+2));
			//System.out.println(test);
			
			if(test.charAt(0)+1 == test.charAt(1))
				incPattern++;
			if(test.charAt(0)-1 == test.charAt(1))
				decPattern++;
		}
		//System.out.println(incPattern);
		//System.out.println(decPattern);
		
		return Math.max(incPattern, decPattern);
	}
	
	public static String readFile()
	{
		//Scanner F = new Scanner(System.in);	  
		
		Scanner f = null;
		
		try 
		{
			f = new Scanner(new File("//wyom-san//students//2016//216066//workspace//FileReading//src//Demo.txt"));
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
			
			if(line.equalsIgnoreCase(password))
			{
				return "Don't use dictionary words!";
			}
			//System.out.println(line);
		}
		f.close(); // close the file or ????????
		return "";
	}
	
	public String toString()
	{
		return total+"";
	}
}
