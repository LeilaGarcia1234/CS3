//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

   {
      count = new ArrayList<>();
      letters = new ArrayList<>();
   }

	public Histogram()
	{
	}

	public Histogram(char[] values)
	{
      
      for(int i=0; i<values.length; i++)
         letters.add(values[i]);
      
		out.println("search letters = " + letters);  
      int size = letters.size();
      for(int i=0; i<size; i++)
         count.add(0);    
	}

	public void loadAndAnalyzeFile(String fName) throws IOException
	{
      fileName = fName;
      Scanner fileName = new Scanner(new File(fName));
      
      while(fileName.hasNextLine())
      {
         String line = fileName.nextLine();
   
         for(char c : line.toCharArray())
         {
                if(letters.indexOf(c) != -1)
                {
                  count.set(letters.indexOf(c), count.get(letters.indexOf(c))+1);
                }
         }
      }
      
	}

	public char mostFrequent()
	{
      int max = Integer.MIN_VALUE;
      for(int i=0; i<count.size(); i++)
      {
         if(count.get(i) > max)
            max = count.get(i);
      }
		return letters.get(count.indexOf(max));
	}

	public char leastFrequent()
	{
      int min = Integer.MAX_VALUE;
      for(int i=0; i<count.size(); i++)
      {
         if(count.get(i) < min)
            min = count.get(i);
      }
		return letters.get(count.indexOf(min));
	}

	public String toString()
	{
	   return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}
