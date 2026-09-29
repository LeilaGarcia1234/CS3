//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases		
      Scanner file = new Scanner(new File("lab06b.daat"));
		int count = file.nextInt();
		ArrayList<VowelWord> list = new ArrayList<>();

		for(int i=0; i<count; i++)
			{
			list.add(new VowelWord(file.next()));
			}
      Collections.sort(list);
		for(VowelWord w : list)
			out.println(w);
	}
}
