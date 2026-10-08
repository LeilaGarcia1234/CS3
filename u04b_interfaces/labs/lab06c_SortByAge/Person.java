//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person( int y, int m, int d, String n)
  {
   myYear = y;
   myMonth = m;
   myDay = d;
   myName = n;
  }

  public int compareTo( Person other )
  {
    //compare years
  	 if(this.myYear < other.myYear)
      return 1;
    if(this.myYear > other.myYear)
      return -1;
      
    //compare months
    if(this.myMonth > other.myMonth)
      return 1;
    if(this.myDay > other.myDay)
      return 1;
    
    //commpare days
    if(this.myDay < other.myDay)
      return 1;
    if(this.myDay > other.myDay)
      return -1;
    
    //compare names
    if(this.myName.compareTo(other.myName) > 0)
      return 1;
    if(this.myName.compareTo(other.myName) < 0)
      return -1;
      
    return 0;
  }
  public String toString( )
  {
     //return "" + myYear + " " + myMonth + " " + myDay + " " + myName;
     return "" + myName + "    DOB:" + myYear + "-" + myMonth + "-" + myDay;
  }
}