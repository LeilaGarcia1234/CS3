//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09b
{
	public static void main(String args[])
	{
		//add test cases	
      AtCounter test = new AtCounter();
      out.println("0 0 has " + test.countAts(0, 0) + " @'s connected.");
      
      out.println("2 5 has " + test.countAts(2, 5) + " @'s connected.");
      
      out.println("5 0 has " + test.countAts(5, 0) + " @'s connected.");
      
      out.println("9 9 has " + test.countAts(9, 9) + " @'s connected.");
      
      out.println("3 9 has " + test.countAts(3, 9) + " @'s connected.");
      
      /* for void method:
      test.countAts(0,0);
      out.println("0 0 has " + test);	
      
      test.countAts(2,5);
      out.println("2 5 has " + test);
      
      test.countAts(5,0);
      out.println("5 0 has " + test);
      
      test.countAts(9,9);
      out.println("9 9 has " + test);
      
      test.countAts(3,9);
      out.println("3 9 has " + test);*/
	}
}