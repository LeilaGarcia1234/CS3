//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class Lab13b
{
	public static void main ( String[] args )
	{
		//add test cases	
      
      SyntaxChecker test = new SyntaxChecker("[ { } ]");
      out.println(test);
      out.println(test.checkExpression());
      
      SyntaxChecker test1 = new SyntaxChecker("[");
      out.println(test1);
      out.println(test1.checkExpression());
      
      SyntaxChecker test2 = new SyntaxChecker("[ { < ( ) > } ]");
      out.println(test2);
      out.println(test2.checkExpression());
      
      
	}
}