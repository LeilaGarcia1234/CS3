//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;

	public Grid()
	{
	}

	public Grid(int rows, int cols, String[] vals)
	{
      setGrid(rows, cols, vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
      grid = new String[rows][cols];
      int size = vals.length-1;
      for(int r=0; r<rows; r++){
         for(int c=0; c<cols; c++){
            grid[r][c] = vals[(int)(Math.random() * vals.length)];
         }
      }
	}

	public int findMax(String val)
	{
		int max = 0;
		for(int r=0; r<grid.length; r++)
		{
			for(int c=0; c<grid[r].length; c++)
			{
				int count = findMax(r, c, search);
				if(count > max)
				{
					max = count;
				}
			}
		}
	}

	private int findMax(int r, int c, String search)
	{
      //search entire array for letter, if the spot has that letter, check up down left right to see if that one is
      //also the letter, if it is then count++ and set count to the max ; once you are done with one spot go to the next 
      //and do the same thing if the next count is greater than max then set that one as the new max
        int max = 0;
		
	}

	public String toString()
	{
		String output="";
      for(int r=0; r<grid.length; r++)
      {
         for(int c=0; c<grid[r].length; c++)
         {
            output += grid[r][c] + " ";
         }
         output += "\n";
      }
		return output;
	}
}
