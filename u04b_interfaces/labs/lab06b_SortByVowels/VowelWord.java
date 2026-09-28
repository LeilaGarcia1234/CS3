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
	String word = "";

	//add a constructor
   public VowelWord(String wrd)
   {
      word = wrd;
   }

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
      String wordy = word;
      for(int i=0; i<wordy.length(); i++)
      {
         if(wordy.substring(i,i+1).indexOf(vowels) != -1)
         {
            vowelCount++;
         }
         wordy = wordy.substring(i+1);
      }
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		
      if(this.word.numVowels() > other.word.numVowels())
            return 1;
      if(this.word.numVowels() < other.word.numVowels())
            return -1;
      return this.word.compareTo(other.word);
      
      
               
	}

	public String toString()
	{
		
      for(int i=0; i<something.length-1; i++)
            if(str.compareTo(other) > 0)
               String temp = str;
               str = other;
               other = temp;
      */
      return "";
	}
}