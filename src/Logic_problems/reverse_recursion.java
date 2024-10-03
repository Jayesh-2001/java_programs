package Logic_problems;

public class reverse_recursion {
   public static String Reverse(String str) {
      if (str.isEmpty()) {
         return str;
      }
      return Reverse(str.substring(1))+str.charAt(0);
   }
   public static void main(String[] args) {
      String str = "Hello World!";
      String reversed = Reverse(str);

      System.out.println(reversed);      
   }
}
