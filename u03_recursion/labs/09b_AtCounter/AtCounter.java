//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public void countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      atCount=0;
      int output = 0;
    
      if(((r>=0 && r<atMat.length) && (c>=0 && c<atMat[r].length)) && atMat[r][c]=='@')
      {
                atCount++;
                atMat[r][c] == ' ';
                countAts(r-1, c);
                countAts(r+1, c);
                countAts(r, c-1);
                countAts(r, c+1);
         
      }
      out.println("" + output);

	}

	public String toString() {
		String output="";
		output += atCount+ " @s connected.";
		return output;
	}
}
