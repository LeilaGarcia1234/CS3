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
	}
}
