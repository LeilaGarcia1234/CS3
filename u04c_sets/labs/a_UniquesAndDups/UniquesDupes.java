//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
      
		//add code
      String[] words = input.split(" ");      
      ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
      
      for(String word : list)
         uniques.add(word);
      
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
      Set<String> uniques = new TreeSet<String>();
      Set<String> dupes = new TreeSet<String>();
		String[] words = input.split(" ");      
      ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
      
      for(String word : list)
      {
         if(uniques.add(word) == false)
            dupes.add(word);
      }
      
		return dupes;
	}
}