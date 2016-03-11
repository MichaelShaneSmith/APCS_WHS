
public class Card 
{
	private int value;
	private String suit;
	private boolean drawn;
	
	public Card()
	{
		value = 0;
		suit = "";
		drawn = false;
	}
	
	public Card(int v, String s, boolean b)
	{
		value = v;
		suit = s;
		drawn = b;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public boolean Drawn()
	{
		return drawn;
	}
	
	// overwritten method
	public boolean equals(Object other)
	{
		Card temp = (Card)other;		// class casting
		if(temp.getValue() == value)
		{
			if(temp.getSuit().equals(suit))
			{
				return true;
			}
				
		}
		
		return false;
	}
	
	public int copmareTo(Object other)
	{
		Card Temp = (Card)other;
		
		if(value != Temp.getValue())
		{
			return value - Temp.getValue();
		}
		// values match
		int ourSuit = 0;
		int tempSuit = 0;
	
		if(suit.equalsIgnoreCase("spades"))
		{
			ourSuit = 4;
		}
		
		if(suit.equalsIgnoreCase("hearts"))
		{
			ourSuit = 3;
		}
		
		if(suit.equalsIgnoreCase("clubs"))
		{
			ourSuit = 2;
		}
		
		if(suit.equalsIgnoreCase("diamonds"))
		{
			ourSuit = 1;
		}
		//-------------------------------------//
		
		if(Temp.getSuit().equalsIgnoreCase("spades"))
		{
			tempSuit = 4;
		}
		
		if(Temp.getSuit().equalsIgnoreCase("hearts"))
		{
			tempSuit = 3;
		}
		
		if(Temp.getSuit().equalsIgnoreCase("clubs"))
		{
			tempSuit = 2;
		}
		
		if(Temp.getSuit().equalsIgnoreCase("diamonds"))
		{
			tempSuit = 1;
		}
		
		return 13* ourSuit-tempSuit;
	
	}
	
	public boolean draw()
	{
		drawn = true;
		
		return drawn;
	}
	
	public String position()
	{
		if(drawn == false)
			return "In Deck";
		else
			return "In Hand";
	}
	
	public String toString()
	{
		if(value==1)
			return "Ace of " + suit+", "+position();
		if(value==11)
			return "Jack of " + suit+", "+position();
		if(value==12)
			return "Queen of " + suit+", "+position();
		if(value==13)
			return "King of " + suit+", "+position();
			else
				return value+" of "+suit+", "+position();
	}
}
