//import javax.swing.JOptionPane;


public class ThingRunner 
{

	
	public static void main(String[] args) 
	{
		
		// String name = "Bob";
		
		Thing T1 = new Thing(); //Instantiate
		
		T1.setName("Travis");
		T1.setID(31245);
		T1.setGPA(1.2);
		System.out.println(T1); //display
		//JOptionPane.showMessageDialog(null, T1);
		
		/*Thing T2 = new Thing("Arnold");
		T2.setID(21413);
		T2.setGPA(2.5);
		System.out.println(T2); //display
		//JOptionPane.showMessageDialog(null, T2);*/
		
		System.out.println(T1.getGPA());
		//print one field only
		
		Thing T3 = new Thing("Percy", 42, 1.2);
		System.out.println(T3);

	}

}
