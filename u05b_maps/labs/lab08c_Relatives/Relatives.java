//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
      map = new TreeMap<String,Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
      
      Set<String> relatives = new TreeSet<>();
      
      if(map.containsKey(personRelative[0]))
      {
         Set<String> keys = map.keySet();
         for(String k : keys)
         {
            if(k.equals(personRelative[0]))
            {
               for(String s : map.get(k))
               {
                  relatives.add(s);
               }
            }
         }
      }
      if(personRelative.length >= 2)
         relatives.add(personRelative[1]); 
      
      map.put(personRelative[0], relatives);
      
	}


	public String getRelatives(String person)
	{
	
      return "";
	}


	public String toString()
	{
		String output=""+map.toString();








		return output;
	}
}