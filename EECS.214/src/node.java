
public class node 
{
	int value;
	node next;
	
	public node()
	{
		value = 0;
		next = null;
	}
	
	public node(int v)
	{
		value = v;
	}
	
	public node(int v, node n)
	{
		value = v;
		next = n;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public void setNext(node n)
	{
		next = n;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public node getNext()
	{
		return next;
	}
	
	public String toString()
	{
		if(next == null)
		{
			return "|"+value+"| -> null";
		}
		else
		{
			return "|"+value+"| -> " + next;
		}
	}
	
}
