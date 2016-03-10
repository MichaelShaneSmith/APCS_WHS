
public class Card 
{
	private int value;
	private String suit;
	
	public Card()
	{
		value = 0;
		suit = "";
	}
	
	public Card(int v, String s)
	{
		value = v;
		suit = s;
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
	
	public String toString()
	{
		return value+" of "+suit;
	}
}
