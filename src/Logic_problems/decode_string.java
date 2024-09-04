package Logic_problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class decode_string {

   public static String decodeString(String s) {
      Stack<Integer> s1 = new Stack<>();
      Stack<String> s2 = new Stack<>();
      int num = 0;
      String res = "";
      for (char c : s.toCharArray()) {
         if ('0' <= c && c <= '9') {
            num = num * 10 + c - '0';
         } else if (c == '[') {
            s1.push(num);
            s2.push(res);
            num = 0;
            res = "";
         } else if (c == ']') {
            StringBuilder t = new StringBuilder();
            for (int i = 0, n = s1.pop(); i < n; ++i) {
               t.append(res);
            }
            res = s2.pop() + t.toString();
         } else {
            res += String.valueOf(c);
         }
      }
      return res;
   }

   public static void main(String[] args) {
      String s = "3[a2[c]]";

      System.out.println(decodeString(s));
   }

}
