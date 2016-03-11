import javax.swing.JOptionPane;

// 215 = hit
// 167 = sunk
// 79 = miss
// 126 = initial

public class space 
{
	private char condition;
	private boolean ship;
	private int number;
	
	public space()
	{
		condition = 126;
		ship = false;
	}
	
	public space(char c, boolean b, int i)
	{
		condition = c;
		ship = b;
		number = i;
	}
	
	public void ship()
	{
		ship = true;
		//condition = 83;
	}
	
	public char number(char n)
	{
		condition = n;
		return condition;
	}
	
	public void shot()
	{
		if( ship == true)
		{
			JOptionPane.showMessageDialog( null, "Hit!");
			condition = 215;
		}
		else
		{
			JOptionPane.showMessageDialog( null, "Miss...");
			condition = 79;
		}
	}
	
	public char getCondition()
	{
		return condition;
	}
	
	public void sunk()
	{
		condition = 167;
	}
	
	public String toString()
	{
		//return ""+ ship;
			
		return ""+condition;
		
		
	}
}
