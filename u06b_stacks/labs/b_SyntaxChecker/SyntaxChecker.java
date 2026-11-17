//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

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
      //You can change this to a stack of Strings if you prefer.
   	//Stack<Character> symbols;   
      Stack<String> symbols = new Stack<>();
      String[] words = exp.split(" ");
      for(String symbol : words)
      {
         stack.push(symbol);
      }
      
      Map<String, String> map = new Map<String, String>();
      map.put("[","]");
      map.put("{","}");
      map.put("(",")");
      
      while(!symbols.isEmpty())
      {
         String sym = symbols.peek();
         if(map.containsKey(sym))
            symbols.push(sym);
         else if(map.containsValue(sym))
         {
            if(!symbols.isEmpty())
                
         }
      }
         
   
		return false;
	}

	//write a toString method
}