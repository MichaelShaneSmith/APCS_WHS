
public class Translate 
{
	
	public static void main(String [] args)
	{
	   pigLatin PL = new pigLatin();

	   PL.toPigLatin("Four Score And Seven Years Ago");

	   //System.out.println(PL.toEnglish("ourFay oreScay Andway evenSay earsYay Agoway"));
	}
	
	
	/*PIG LATIN
	Write a class that translates an English sentence into Pit Latin. 
	As a reminder, Pig Latin is formed by:

	1. If a word starts with consonant letters, 
	move all of them up to the first vowel to the end
	of the word and add "ay" after it.

	For example:
	dog - ogday
	crisp - ispcray

	2. Add "way" after words that begin with vowels.
	For example:
	over - overway
	all - allway

	Here is your main.
	public static void main(String [] args)
	{
	    PigLatin PL = new PigLatin();

	   System.out.println(PL.toPigLatin("Four Score And Seven Years Ago"));

	   System.out.println(PL.toEnglish("ourFay oreScay Andway evenSay earsYay Agoway"));
	}

	The use of the PigLatin class must follow as shown above.  
	However, you may make minor changes to the main. 
	For example, if you would like to add a loop to continue entering sentences that is ok.

	Take care to notice that the String parameters are sent in using Title Case 
	(capitalize the first letter of each word), this will make your life much easier...

	HINT:

	Use the .split() method in the String class. 
	It will allow you to break the input into separate words, 
	each in a separate element of an array.
	
	For Example:
	String line = "how now brown cow";
	String [] words = line.split(" ");*/
}
