import java.util.Random;

import javax.swing.JOptionPane;

//Write a program that plays the dice game called Craps.  Here are the rules:

//A player rolls two dice and adds the values together.  
//If the total is 7 or 11, the player wins.
//If the total is 2, 3, or 12, the player loses.

//If the total is anything else, that value becomes the "point", and the player rolls again.
//If the player rolls the "point" he wins, if he rolls a 7, he loses.

//The player keeps rolling until he wins or loses.

//At the end of the game, the player should be asked if he wants to play again.
// 4 5 6 8 9 10 
public class Craps 
{

	public static void main(String[] args) 
	{
		String newGame = "";
		Random rand = new Random();  

		
		do
		{
			int r1 = rand.nextInt(6)+1;
			System.out.println("Roll #1 is " +r1);
			 
			int r2 = rand.nextInt(6)+1;
			System.out.println("Roll #2 is " +r2);
			
			if((r1+r2)==7 || (r1+r2)==11)
				{
					System.out.println("You Win!");
					JOptionPane.showMessageDialog( null, "You win!");
					newGame = JOptionPane.showInputDialog("New Game?");
				}
			else
			{
				if((r1+r2)==2 || (r1+r2)==3 || (r1+r2)==12)
					{
						System.out.println("You Lose!");
						JOptionPane.showMessageDialog( null, "You Lose!");
						newGame = JOptionPane.showInputDialog("New Game?");
					}
				else
				{
					int stop = 0;
					do
					{
						int point = r1+r2;
						System.out.println("Point is " + point);
						System.out.println();
						
						int r3 = rand.nextInt(6)+1;
						System.out.println("Roll #3 is " +r3);
						
						int r4 = rand.nextInt(6)+1;
						System.out.println("Roll #4 is " +r4);
						
						System.out.println("New Total " + (r3+r4));
						if((r3+r4)== point)
							{
								System.out.println("You Win!");
								JOptionPane.showMessageDialog( null, "You Win!");
								stop = 1;
							}	
							else
							{
								if((r3+r4)==7)
								{
									System.out.println("You Lose!");
									JOptionPane.showMessageDialog( null, "You Lose!");
									stop = 1;
								}
								else
								{
									JOptionPane.showMessageDialog( null, "Reroll?");
									
									
								}
							}
						
					}
					while(stop!=1);
					newGame = JOptionPane.showInputDialog("New Game?");
					
				}
			}		
		
		}
		while(!newGame.equals("no"));
	}
}
