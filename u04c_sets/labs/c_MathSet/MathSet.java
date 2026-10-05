//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
      one = new TreeSet<Integer>();
      two = new TreeSet<Integer>();
      String[] ones = o.split(" ");  
     
      for(String s : ones)
         one.add(Integer.valueOf(s));
         
      String[] twos = t.split(" ");
      
      for(String s : twos)
         two.add(Integer.valueOf(s));
      
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new TreeSet<>(one);
      union.addAll(two);
      return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersection = new TreeSet<>(one);
      intersection.retainAll(two);
      return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		//everything in one NOT in two
      //retainAll() = keeps only elements in A that are in B  (removes elements not in B)
      //one - intersection
      Set<Integer> diff = new TreeSet<>(one);
      diff.removeAll(intersection());
      return diff;
	}

	public Set<Integer> differenceBMinusA()
	{
      Set<Integer> diff = new TreeSet<>(two);
      diff.removeAll(intersection());
		return diff;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> symm1 = new TreeSet<>(one);
      symm.addAll(two);
      retain(two)
      remove(intersection)
      
      return null;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}