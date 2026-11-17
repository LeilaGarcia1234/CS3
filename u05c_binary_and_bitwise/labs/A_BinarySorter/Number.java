//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	//add in instance variables
	private String number;
   private int base;
   private int base10;
   private String binary;
	//add in a constructor or two
   
   public Number(String num, int bs)
   {
      number = num;
      base = bs;
      base10 = Integer.parseInt(num, bs);
      binary = Integer.toBinaryString(base10);
   }

	public int compareTo(Number param)
	{
		//1st compare number of ones in binary  (less ones = first, more ones = last)
      //if same num ones, sorty numbers by their base 10 value (smaller base10 go first, bigger nums go last)
      //if base10 vals are same, sort by original values (number variable) (smaller num first, bigger num last)
      
      if(binary.equals(param.binary))
         return 0;
      //test num ones in binary
      int binCount1 = 0;
      for(int i=0; i<binary.length(); i++)
      {
          if(binary.substring(i,i+1).equals("1"))
               binCount1++;
      }
      int binCount2 = 0;
      for(int i=0; i<param.binary.length(); i++)
      {
         if(param.binary.substring(i,i+1).equals("1"))
             binCount2++;
      }
      if(binCount1 < binCount2)
           return -1;
      if(binCount1 > binCount2)
         return 1;
       //test base10 vals
       if(binCount1 == binCount2)
       {
          //test base 10 vals
          if(base10 < param.base10)
             return -1;
          if(base10 > param.base10)
             return 1;
          //if same base10...
          if(base10 == param.base10)
          {
             //test numbers
             if(Integer.parseInt(number) < Integer.parseInt(param.number))
                return -1;
             if(Integer.parseInt(number) > Integer.parseInt(param.number))
                return 1;
          }   
       }
       return 0;
      
     	
	}
	
   // Return these four items in this order, separated by a SPACE:
   //  * the original number
   //  * the base of the original number
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return "" + number + " " + base + " " + base10 + " " + binary;
	}
}
