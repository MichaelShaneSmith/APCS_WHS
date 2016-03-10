
public class Thing 
{
	// private instance fields
		// data that make up a name
	private String name ;  // encapsulation!
	private int number ;   // data hiding
	private double gpa;
	
	
	
	
	
	
	
	// default constructor
		// method called on instantiation
	// must match the class name EXCACTLY!
	public Thing()
	{
		// used to instantiate
		// used to setup default values
		name = "";
		number = 0;
		gpa = -99.9;
	}
	
	
	
	
	
	
	
	
	// overloaded constructor(s)
		// overloaded - different method, same name
		// overloaded must have different parameters
	
	public Thing(String n, int num, double g)
	{
		name = n;
		number = num;
		gpa = g;
	}
	
	
	
	
	
	

	// accessor functions (getters)
	public double getGPA()
	{
		return gpa;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return number;
	}
	
	
	
	
	
	
	
	
	// mutator methods (setters)
		// used to change field values
	public void setName(String n)
	{
		name = n;
		// NOT n=name
	}
	
	public void setID(int n)
	{
		number = n;
	}
	
	public void setGPA(double g)
	{
		gpa = g;
	}
	
	// helper methods
		// any method not the others
	
	
	
	
	
	
	// toString
	public String toString()
	{
		// sends back understandable information
		// make it look "pretty"
		// called automatically when needed
		return "Student: " + name + "   ID:" + number +"   GPA: "+ gpa;
	}
	
	

}
