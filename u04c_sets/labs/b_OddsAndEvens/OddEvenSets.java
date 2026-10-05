//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
	}

	public OddEvenSets(String line)
	{
      odds = new TreeSet<Integer>();
      evens = new TreeSet<Integer>();
      String[] words = line.split(" ");  
      ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
     
      
      for(String word : list)
      {
         if(Integer.valueOf(word) % 2 == 0)
            evens.add(Integer.valueOf(word));
         else
            odds.add(Integer.valueOf(word));
      }
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}