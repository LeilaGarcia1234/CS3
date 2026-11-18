//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
      setExpression("");
	}

	public SyntaxChecker(String s)
	{
      setExpression(s);
	}
	
	public void setExpression(String s)
	{
      exp = s;
	}

	public boolean checkExpression()
	{
      //stack that stores symbols from expression
      Stack<String> symbols = new Stack<>();
      //make exp into array of individual chars
      String[] words = exp.split(" ");
      //for each char in array. add that char to stack
      for(String symbol : words)
      {
         symbols.push(symbol);
      }
      out.println(symbols);
      /*
      Map<String, String> map = new TreeMap<String, String>();
      map.put("[","]");
      map.put("{","}");
      map.put("(",")");
      map.put("<",">");
      
      while(!symbols.isEmpty())
      {
         String sym = symbols.peek();
         if(map.containsKey(sym))
            symbols.push(sym);
         else if(map.containsValue(sym))
         {
            if(!symbols.isEmpty())
            {
                symbols.pop();
                //if symbol equals close? what
                //check for a match with curr close symbol?
                return true;
            }
            else
               return false; //?
            
         }
      }
         
      */
		return false;
      
	}
   
	//write a toString method
   
   public String toString()
   {
      return exp;
   }
   
}