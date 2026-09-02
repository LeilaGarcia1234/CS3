//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
      if(size <=0)
         throw new IllegalArgumentException("The size must be positive");
      magicSquare = new int[size][size];
      createMagic(size);
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
	}

	public void createMagic(int size)
	{
      size = magicSquare.length;
		int num = 1;
		magicSquare[0][size/2]= num;
      
      int r = 0;
      int c = size/2;
      
      for(num = 2; num <= size*size; num++)
      {
         
         if(r-1 < 0)
            r = size-1;
         else
            r = r-1;
         if(c+1 > magicSquare[r].length-1)
            c = 0;
         else
            c = c+1;
         
         
            if(magicSquare[r][c] != 0)
            {
              
               if(r+1 > size-1)
                  r=0;
               else
                  r = r+1;
                  
               if(c-1 < 0)
                 c = magicSquare[0].length-1;
               else
                  c = c-1;
                  
               if(r+1 > size-1)
                  r=0;
               else
                  r = r+1;
            }
         
         
         magicSquare[r][c] = num;
        
      }
      
      
	}
	public String toString( )
	{
		String output="";
      for(int r=0; r<magicSquare.length; r++)
      {
         for(int c=0; c<magicSquare[r].length; c++)
         {
            output += magicSquare[r][c] + "\t";
         }
         output += "\n";
      }

		return output;
	}
}

