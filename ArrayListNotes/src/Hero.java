
public class Hero implements Comparable
{
	private String name;
	private String secretID;
	private String ability;
	
	public Hero()
	{
		name = "";
		secretID = "";
		ability = "";
	}
	
	public Hero(String n, String s, String a)
	{
		name = n;
		secretID = s;
		ability = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSecretID()
	{
		return secretID;
	}
	
	public String getAbility()
	{
		return ability;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setSecretID(String s)
	{
		secretID = s;
	}
	
	public void setAbility(String a)
	{
		ability = a;
	}
	
	public int compareTo(Object temp)
	{	
		return name.compareToIgnoreCase(((Hero) temp).getName());
	}
	
	public String toString()
	{
		System.out.println();
		return "\n"+name+"(a.k.a. "+secretID+") Power: "+ability+"\n";
	}
}
