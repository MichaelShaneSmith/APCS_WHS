
public class pigLatin 
{
	private String sentence;
	
	public pigLatin()
	{
		sentence = " ";
	}
	
	public pigLatin(String s)
	{
		sentence = s;
	}
	
	public void setSentence(String s)
	{
		sentence = s;
	}
	
	//public String toEnglish()
	{
		
	}
	
	public void toPigLatin(String s)
	{
		//String line = "how now brown cow";
		sentence = s;
		String [] words = sentence.split(" ");
		for(int x=0; x<words.length; x++)
		{
			System.out.println(words[x]);
		}
		
		int endIndex;
		
		for(int x=0; x<words.length; x++)
		{
			endIndex = 100;
			
			if(words[x].toLowerCase().indexOf("a")!=-1)
			{
				endIndex = Math.min(words[x].toLowerCase().indexOf("a"),endIndex);
			}
			
			if(words[x].toLowerCase().indexOf("e")!=-1)
			{
				endIndex = Math.min(words[x].toLowerCase().indexOf("e"),endIndex);
			}
			
			if(words[x].toLowerCase().indexOf("i")!=-1)
			{
				endIndex = Math.min(words[x].toLowerCase().indexOf("i"),endIndex);
			}
			
			if(words[x].toLowerCase().indexOf("o")!=-1)
			{
				endIndex = Math.min(words[x].toLowerCase().indexOf("o"),endIndex);
			}
			
			if(words[x].toLowerCase().indexOf("u")!=-1)
			{
				endIndex = Math.min(words[x].toLowerCase().indexOf("u"),endIndex);
			}
			
			System.out.println(endIndex);
			
			words[x].substring(0,endIndex);
		}
		
	}
	
	public String toString()
	{
		return sentence + "";
	}
}
