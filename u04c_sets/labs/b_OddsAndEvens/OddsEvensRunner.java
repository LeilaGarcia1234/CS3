//Copyright A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddsEvensRunner
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
	   OddEvenSets test = new OddEvenSets("1 5 9 4 6 8 12");
      out.println(test);
      
      test = new OddEvenSets("1 5 9 4 6 8 12");
      out.println(test);
      
      test = new OddEvenSets("3 5 7 17 29 4 6 56 72");
      out.println(test);

      test = new OddEvenSets("3 6 12 2 28 6");
      out.println(test);

      test = new OddEvenSets("4 4 4 4 4 4 4 4");
      out.println(test);

      test = new OddEvenSets("1 1 1 1 1 1 1 1");
      out.println(test);
      
      test = new OddEvenSets("1 2 3 4 5 6 7 8 9");
      out.println(test);

	}
}