import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball 
{
	
	public static void main(String[] args) 
	{
		String repeat = "";
		do
		{
			JOptionPane.showInputDialog("Enter a Question?");
			// pick a random number
			Random rand = new Random();  // define number generator
			int pick = 0;
			pick = rand.nextInt(10);
			System.out.println(pick);
			
			// choose a message
			// display message
			if(pick==0)
				System.out.println("Insert $1 & Try Again");
			if(pick==1)
				System.out.println("That's a Difficult One, Have you Tried Contacing a Witch Doctor?");
			if(pick==2)
				System.out.println("What Do I Look Like Some Kind of Fortune-teller?");
			if(pick==3)
				System.out.println("Consult the Magic Conch");
			if(pick==4)
				System.out.println("IDK...Maybe?..Honestly I'm Not Too Good at My Job");
			if(pick==5)
				System.out.println("Collecting the Dragonballs will solve all your problems");
			if(pick==6)
				System.out.println("Stockpile your resources, rapture is upon you");
			if(pick==7)
				System.out.println("Professor Oak says: \"There is a time and place for everything\"");
			if(pick==8)
				System.out.println("When the Going gets Tough, the Tough Turn Up");
			if(pick==9)
				System.out.println("Praise the Sun!!");
			// ask to play again
			repeat = JOptionPane.showInputDialog("Play Again?");
		}
		while(!repeat.equals("no"));
			
		
	}

}
 