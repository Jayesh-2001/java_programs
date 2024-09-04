package Logic_problems;

import java.util.HashMap;
import java.util.Map;

public class first_non_repetitive {
   public static void main(String[] args) {
       String str = "amazon";  

        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (m.get(c) == 1) {
                System.out.println("The first non-repetitive character is: " + c);
                break; 
            }
        }

        System.out.println("There is no non-repetitive character in the string.");

   }
}
