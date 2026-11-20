//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class ExpressionSolver
{
   /** Returns the result of applying the given operator 
       to the given operands. Only addition, subtraction,
       multiplication and division are supported.
       
       @throws UnsupportedOperationException if op isn't 
               a supported operator.
   **/
   private static double calc(double one, double two, String op) {
      switch(op) 
      {
         case "+" :
            return one + two;
         case "-" :
            return one - two;
         case "*" :
            return one * two;
         case "/" :
            return one / two;
         default:
            throw new IllegalArgumentException("wrong symbols stop it");
      }
   } 
   //             
   //
   //                         3
   // String: "2 3 +"  stack: 2
   /*** Postfix Evaluator ***/   
   public static double solvePostfix(String expression) 
   {
      Stack<Double> stack = new Stack<>();
      Scanner scan = new Scanner(expression);
      while(scan.hasNext())
      {
         while(scan.hasNextDouble())
         {
            stack.push(scan.nextDouble());
         }
         double two = stack.pop();
         double one = stack.pop();
         double calculation = calc(one, two, scan.next());
         stack.push(calculation);
         
      }
      
      return stack.pop();
   } 
   //                          
   //           0 1 2       
   //  String: "+ 2 3"   stack:
   /*** Prefix Evaluator ***/   
   public static double solvePrefix(String expression) {
      double calculation = 0.0;
      Stack<Double> stack = new Stack<>();
      String[] exp = expression.split(" ");
      //   2 1 0
      //   3 2 +
      for(int i=exp.length-1; i>=0; i--)
      {
         if(isNumber(exp[i]))
         {
            stack.push(Double.parseDouble(exp[i]));
         }
         else
         {
             calculation = calc(stack.pop(), stack.pop(), exp[i]);
             stack.push(calculation);
         }
      }
      return stack.pop();
   }   
   
   //This catches both kinds of exceptions
   //that parseDouble might throw.
   public static boolean isNumber(String symbol) {
      if(symbol == null)
         return false;
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NullPointerException | NumberFormatException e) {
         return false;
      }
   }
}