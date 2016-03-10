import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGame 
{
	public static void directions()
	{
		//Directions
		JOptionPane.showMessageDialog( null, "The Number Game!\nHow to Play - Choose a number between 0 and 100.\nIf your number is too High or too Low, you will be notified.\nDon't get too excited, because you have a limited number of guesses.\nMost of All: Enjoy!");	
	}
	
	public static int randomNumber()
	{
		Random rand = new Random();  
		int number = 0;
		number = rand.nextInt(101);
		System.out.println(number);
		return number;
	}
	
	public static void playGame()
	{
		int number = randomNumber();
		int picks = 7;
		do
		{
			
			int guess = Integer.parseInt ( JOptionPane.showInputDialog("Pick a Number!"));
			System.out.println(guess);
		
			if(number==guess)
			{
				JOptionPane.showMessageDialog( null, "Correct, You are Victorious!");
				picks=0;
			}
			else
			{
				if(guess>number)
					JOptionPane.showMessageDialog( null, "Try Again, Failure...\nHint: Guess Lower");
				else
					JOptionPane.showMessageDialog( null, "Try Again, Failure...\nHint: Guess Higher");
					
				picks--;
				JOptionPane.showMessageDialog( null, "Number of Picks: " + picks);
			}
		}
		while(picks>0);
		JOptionPane.showMessageDialog( null, "Game Over\nThe number was: " + number);
	}
	
	public static void main(String[] args) 
	{
		directions();
		String newGame = "";
		do
		{
			playGame();
			newGame = JOptionPane.showInputDialog("New Game?");
		}
		while(!newGame.equals("no"));
	}
}
