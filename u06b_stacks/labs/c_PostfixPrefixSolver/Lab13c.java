//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab13c
{
	public static void main ( String[] args )
	{
		//Postfix
      ExpressionSolver test1 = new ExpressionSolver();
      out.println("2 7 + 1 2 + + = " + test1.solvePostfix("2 7 + 1 2 + +"));
      
      ExpressionSolver test2 = new ExpressionSolver();
      out.println("1 2 3 4 + + - = " + test2.solvePostfix("1 2 3 4 + + -"));
      
      ExpressionSolver test3 = new ExpressionSolver();
      out.println("9 3 * 8 / 4 + = " + test3.solvePostfix("9 3 * 8 / 4 +"));
      
      ExpressionSolver test4 = new ExpressionSolver();
      out.println("19 3 / 2 * 7 9 * + 43 - = " + test4.solvePostfix("19 3 / 2 * 7 9 * + 43 -"));
      
      ExpressionSolver test5 = new ExpressionSolver();
      out.println("35 5 + 2 * 4 / 19 + = " + test5.solvePostfix("35 5 + 2 * 4 / 19 +"));
      
      ExpressionSolver test6 = new ExpressionSolver();
      out.println("35 5 + 2 * 4 / 19 + = " + test6.solvePostfix("2.3 49.2 + 0.27 * 9 2 / +"));
      
      //prefix
      ExpressionSolver test7 = new ExpressionSolver();
      out.println("+ 2 3 = " + test7.solvePrefix("+ 2 3"));
      
      ExpressionSolver test8 = new ExpressionSolver();
      out.println("- 2 3 = " + test8.solvePrefix("- 2 3"));
      
      ExpressionSolver test9 = new ExpressionSolver();
      out.println("* 2 3 = " + test9.solvePrefix("* 2 3"));
      
      ExpressionSolver test10 = new ExpressionSolver();
      out.println("/ 2 3 = " + test10.solvePrefix("/ 2 3"));
      
	}
}
