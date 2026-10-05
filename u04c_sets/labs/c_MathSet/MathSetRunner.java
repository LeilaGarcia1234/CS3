//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
      MathSet test = new MathSet("1 2 3 4 5", "4 5 6 7 8");
      out.println(test);
      out.println("Union - " + test.union());
      out.println("Intersection - " + test.intersection());
      out.println("difference A-B - " + test.differenceAMinusB());
      out.println("difference B-A - " + test.differenceBMinusA());
      out.println("symmetric difference - " + test.symmetricDifference());
      out.println();
      
      test = new MathSet("10 11 12 13 14 15 16 17", "11 13 15 17 19 21 23");
      out.println(test);
      out.println("Union - " + test.union());
      out.println("Intersection - " + test.intersection());
      out.println("difference A-B - " + test.differenceAMinusB());
      out.println("difference B-A - " + test.differenceBMinusA());
      out.println("symmetric difference - " + test.symmetricDifference());
      out.println();
      
      test = new MathSet("4 5 6 7 8 76", "3 4 5 6 23 46 53");
      out.println(test);
      out.println("Union - " + test.union());
      out.println("Intersection - " + test.intersection());
      out.println("difference A-B - " + test.differenceAMinusB());
      out.println("difference B-A - " + test.differenceBMinusA());
      out.println("symmetric difference - " + test.symmetricDifference());
      out.println();
	}
}
