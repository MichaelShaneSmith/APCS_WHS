
public class Lists 
{
	
	public static void insertHead(node newHead, node list)
	{
		if(newHead.next == null)
		{
			newHead.next = list;
		}
		else
		{
			while(newHead.next != null)
			{
				newHead = newHead.next;
			}
			
			newHead.next = list;
		}
	}
	
	public static void insertTail(node newTail, node list)
	{
		if(list.next == null)
		{
			list.next = newTail;
		}
		else
		{
			while(list.next != null)
			{
				list = list.next;
			}
			
			list.next = newTail;
		}
	}
	
	public static void deleteHead(node list)
	{
		
	}
	
	public static void main(String[] args) 
	{
		node first = new node(1,null);
		node second = new node(2, null);
		node third = new node(3,null);
		
		first.next = second;
		second.next = third;
		
		//third.next = first;
		
		System.out.println(first);
		
		/*node test = new node(0,null);
		insertHead(test, first);
		
		System.out.println(test);
		
		node last = new node(7,null);
		insertTail(last, first);
		
		System.out.println(test);*/
		
	}
}












