//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
	   //add test cases
      //Person test = new Person(1950, 10, 10, "Mark");
      //out.println(test.compareTo(new Person(2010, 4, 20, "Alex")));
      
      Scanner file = new Scanner(new File("lab06c.dat"));
		
		ArrayList<Person> list = new ArrayList<>();
      file.next();
      while(file.hasNext())
	   {
			list.add(new Person(file.nextInt(), file.nextInt(), file.nextInt(), file.next()));
		}
      Collections.sort(list);
		for(Person p : list)
			out.println(p);

      
	}
}