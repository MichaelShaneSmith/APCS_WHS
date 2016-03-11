import java.util.Random;

import javax.swing.JOptionPane;


public class Deck 
{
	static Card[] deck = new Card[52];
	
	public static void initialize()
	{
		for(int x=0; x<deck.length; x++)
		{
			deck[x] = new Card();
			
			//System.out.println(x+" "+deck[x]);
		}
	}
	
	public static void newDeck()
	{
		initialize();
		
		for(int x=0; x<deck.length; x++)
		{
			if(x>=0 && x<=12)
			{
				deck[x].setSuit("spades");
				
				for(int y=1; y<=13; y++)
				{
					deck[y-1].setValue(y);
				}
			}
			
			if(x>=13 && x<=25)
			{
				deck[x].setSuit("hearts");
				
				for(int y=1; y<=13; y++)
				{
					deck[13+y-1].setValue(y);
				}
			}
			
			if(x>=26 && x<=38)
			{
				deck[x].setSuit("clubs");
				
				for(int y=1; y<=13; y++)
				{
					deck[26+y-1].setValue(y);
				}
			}
			
			if(x>=39 && x<=52)
			{
				deck[x].setSuit("diamonds");
				
				for(int y=1; y<=13; y++)
				{
					deck[39+y-1].setValue(y);
				}
			}
			
			System.out.println(x+" "+deck[x]);
		}
	}
	
	public static void shuffle()
	{
		 Card swap = new Card();
		 //System.out.println(swap);
		
		for(int x=0; x<10; x++)
		{
			for(int y=0; y<=51; y++)
			{
				Random rand = new Random();  
				int number = 0;
				number = rand.nextInt(52);
				//System.out.println(number);
				
				swap = deck[y];
				deck[y] = deck[number];
				deck[number] = swap;
			}
		}
		
		for(int x=0; x<=51; x++)
		{
			System.out.println(" "+deck[x]);
		}
	}
	
	public static void drawCard()
	{
		Random rand = new Random();  
		int number = 0;
		number = rand.nextInt(52);
		//System.out.println(number);
		
		if(deck[number].Drawn()==false)
		{
			deck[number].draw();
			System.out.println(deck[number]);
		}
	}
	
	public static void printDeck()
	{
		System.out.println(" ");
		
		for(int x=0; x<=51; x++)
		{
			System.out.println(" "+deck[x]);
		}
	}
	
	public static void removeCard()
	{
		int value = Integer.parseInt ( JOptionPane.showInputDialog("Please Enter A Value"));
		String suit = JOptionPane.showInputDialog("Please Enter A Suit.");
		
		for(int x=0; x<=51; x++)
		{
			if(deck[x].getValue()==value && deck[x].getSuit().equals(suit))
			{
				deck[x].draw();
				System.out.println(deck[x]);
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		newDeck();
		//shuffle();
		//drawCard();
		removeCard();
		printDeck();
	}

}
/*
Assignment #3

*/