//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
      
	}

	public Histogram(String sent)
	{
      histogram = new TreeMap<String,Integer>();
      //turn each diff letter in sent into array of keys
      //turn num of each letter in sent into array of values
      
      for(char c : sent.toCharArray())
      {
         if(! histogram.containsKey(String.valueOf(c)))
            histogram.put(String.valueOf(c),1);
         else
            histogram.put(String.valueOf(c),histogram.get(String.valueOf(c))+1);
      }
	}
	
	public void setSentence()
	{
      
	}

	public String toString()
	{
		String output="char \t 123456789012345 \n";
      for(String k : histogram.keySet())
      {
         output += k + "\t";
         for(int i=0; i<histogram.get(k); i++)
         {
            output += "*";
         }
         output += "\n";
      }
      
		//String allStars="";
      
		return output+"\n\n";
      
      
     
	}
}