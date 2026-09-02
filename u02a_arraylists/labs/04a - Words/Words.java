//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.List;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}
   
   
	public Words(String wordList)
	{
      setWords(wordList);
	}
   
   public List<Word> getWords()
   {  
      return (List<Word>)Collections.unmodifiableList(words);
   }

	public void setWords(String wordList)
	{
      if(wordList == null)
         throw new NullPointerException("can't be null");
         
      words = new ArrayList<>();
      String[] array = wordList.split(" ");
      for(String s : array)
      {
         words.add(new Word(s));
      }

      
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
      for(Word s : words)
      {
         if(s.getLength() == size)
            count++;
      }
		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
      for(int i=words.size()-1; i>=0; i--)
      {
         if(words.get(i).getLength() == size)
            words.remove(words.get(i));
      }
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

      for(Word s : words)
      {
         if(s.getNumVowels() == numVowels)
            count++;
      }

		return count;
	}
	
	public String toString()
	{
	   return "" + getWords();
	}
}
