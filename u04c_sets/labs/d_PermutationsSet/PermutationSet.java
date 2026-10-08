import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
   public static Set<String> permutations(String word) {
      // Make a HashSet to store the permutations of <code>word</code>
      Set<String> set = new HashSet<>();
      // Throw a NPE
      if (word == null)
         throw new NullPointerException("word cannot be null");
      // If `word` is the empty string, add it to your set before returning the set.
      if (word.length() == 0) {
         set.add(word);
         return set;
      }
      // Store the first character
      // Store the rest of the string
      // Call permutations() on rem and store the set it gives you
      // Loop through each permutation of rem
         // Loop through each spot of the current word from rem 
            // Insert <code>init</code> at the current spot
            // Add this permutation to our set of permutations.
            //
            
      String firstChar = word.substring(0,1); 
      String rest = word.substring(1);        
      Set<String> permSet = permutations(rest);
      for(String s : permSet)
      {
         for(int x=0; x<=s.length(); x++)
         {
            String permute = s.substring(0,x) + firstChar + s.substring(x);
            set.add(permute);
         }
      }
      return set;
   }
}