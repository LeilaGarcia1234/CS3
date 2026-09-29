//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;
class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
	private String word;

	//add a constructor
   public VowelWord(String wrd)
   {
      word = wrd;
   }

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
      
      for(int i=0; i<word.length(); i++)
      {
          String str = word.substring(i,i+1);
		  if(vowels.contains(str))
         {
            vowelCount++;
		 }
      }
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		
      if(this.numVowels() > other.numVowels())
            return 1;
      if(this.numVowels() < other.numVowels())
            return -1;
      return this.word.compareTo(other.word);
      
      
               
	}

	public String toString()
	{
		
      return word;
	}
}
