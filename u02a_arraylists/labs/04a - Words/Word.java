//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
      
	}

	public Word(String wrd)
	{
      word = wrd;
	}

	public void setWord(String wrd)
	{
      word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
      for(int i=0; i<getLength(); i++)
      {
         if(word.substring(i,i+1).equals("a") || word.substring(i,i+1).equals("e") || word.substring(i,i+1).equals("i") || word.substring(i,i+1).equals("o") || word.substring(i,i+1).equals("u"))
            count++;
      }
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return "" + word; // + "\n" + "num vowels == " + getNumVowels() + "\n" + "num chars == " + getLength();
	}
}
