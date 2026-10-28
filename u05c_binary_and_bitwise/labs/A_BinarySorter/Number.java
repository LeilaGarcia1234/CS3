//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	//add in instance variables
	private int number;
   private int base;
   private int base10;
   private int binary;
	//add in a constructor or two
   
   public Number(int num, int bs, int bs10, int bin)
   {
      number = num;
      base = bs;
      base10 = 0;
      binary = 0;
   }

	public int compareTo(Number param)
	{
		return 0;		
	}
	
   // Return these four items in this order, separated by a SPACE:
   //  * the original number
   //  * the base of the original number
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return "";
	}
}
