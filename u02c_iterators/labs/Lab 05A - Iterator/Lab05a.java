//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
		//add test cases	
      ArrayList<String> list = new ArrayList<String>();
      IteratorTest test = new IteratorTest();
      
      test.populateListFromString(list ,"a b c a b c a " );
      test.remove(list, "a");
      out.println(list);
      
      test.populateListFromString(list ,"a b c d e f g h i j x x x x " );
      test.remove(list, "a");
      out.println(list);
      
      test.populateListFromString(list ,"1 2 3 4 5 6 a b c a b c " );
      test.remove(list, "a");
      out.println(list);
	}
}

