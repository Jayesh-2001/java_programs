package Logic_problems;

import java.util.HashSet;
import java.util.Set;

public class match_chars {
   public static void main(String[] args) {
      String str1 = "jayesh";
      String str2 = "rakesh";

      Set<Character> set1 = new HashSet<>();
      Set<Character> set2 = new HashSet<>();

      for (int i = 0; i < str1.length(); i++) {
         set1.add(str1.charAt(i));
      }
      for (int i = 0; i < str2.length(); i++) {
         set2.add(str2.charAt(i));
      }

      Set<Character> match = new HashSet<>(set1);

      match.retainAll(set2);

     
      System.out.println(match.toString());

   }
}
