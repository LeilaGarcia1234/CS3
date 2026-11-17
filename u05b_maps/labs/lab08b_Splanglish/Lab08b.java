//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.System.*;

public class Lab08b
{
	public static void main( String args[] ) throws IOException
	{
      SpanishToEnglish test = new SpanishToEnglish();

		Scanner file = new Scanner(new File("dictionary.dat"));      
 
		//read in pairs from the file and load the map

      for(int i=1; i<=46; i++)
      {
         test.putEntry(file.nextLine());
      }
		out.println("\n====\tMAP CONTENTS\t====\n\n");

		//print the map

		out.println(test+"\n\n");

		//read in the lines and convert them
      Scanner phrases = new Scanner(new File("phrase.dat"));
      while(phrases.hasNext())
      {
         out.print(test.translate(phrases.next()) + " ");
      }
      
	}
}