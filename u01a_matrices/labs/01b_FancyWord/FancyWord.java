//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
      int len = word.length();
      mat = new char[len][len];
      
      for(int r=0; r<mat.length; r++)
      {
         for(int c=0; c<mat[r].length; c++)
         {
            mat[r][c] = ' ';
         }
      }
      
      
      for(int c=0; c<word.length(); c++)
      {
         mat[0][c] = word.charAt(c);
         mat[mat.length-1][c] = word.charAt(c);
         mat[c][c] = word.charAt(c);
         mat[mat.length-c-1][c] = word.charAt(c);
      }
      
 
	}

	public String toString()
	{
		String output="";
      for(int r=0; r<mat.length; r++)
      {
         for(int c=0; c<mat[r].length; c++)
         {
            output += mat[r][c];
         }
         output += "\n";
      }
		return output;
	}
}

