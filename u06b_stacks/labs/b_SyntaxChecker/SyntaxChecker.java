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
      Stack<String> symbols = new Stack<>();
      String[] values = exp.split(" ");
      
      Map<String, String> map = new TreeMap<String, String>();
      map.put("[","]");
      map.put("{","}");
      map.put("(",")");
      map.put("<",">");
      
      boolean what = false;
      for(int i=0; i<values.length; i++)
      {
         String val = values[i];
         if(map.containsKey(val))
         {
            symbols.push(val);
         }
         else if(map.containsValue(val))
         {
            if(!symbols.isEmpty())
            {
               String popped = symbols.pop();
               if(map.get(popped) == (val))
                  what = false;
               else
                  what = true;
            }
         }
      }
		return what;
      
	}
   
	//write a toString method
   
   public String toString()
   {
      if(checkExpression())
         return exp + " is correct";
      else
         return exp + " is incorrect";
   }
   
}