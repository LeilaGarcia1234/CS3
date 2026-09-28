//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;
public class Word implements Comparable<Word>
{
	//add an instance variable and a constructor
   //
   String word = "";
   ArrayList<Word> words;
   public Word(ArrayList<Word> wds)
   {
      words = wds;
   }
   
	//add a compareTo
   public int compareTo(Word other) 
   {    
      word = 
      if(this.word.length() > other.word.length())
            return 1;
      if(this.word.length() < other.word.length())
            return -1;
      return this.word.compareTo(other.word);
   }
   
	//add a toString
   public String toString()  
   {    
      String output = "";
      return output;
   }
}