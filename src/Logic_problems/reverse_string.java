package Logic_problems;

public class reverse_string {
   public static String reverse(String str) {
      // char arr[] = str.toCharArray();
      // int l = arr.length;
      String reversed = "";
      for (int i = str.length() - 1; i >= 0; i--) {
         reversed += str.charAt(i); // Using string concatenation
      }
      return reversed;

   }
   public static void main(String[] args) {
      String str = "Hello World";

      System.out.println("Original String: " + str);
      System.out.println("Reversed String: " + reverse(str));

      String str2 = "I am Jayesh. Who are you";
      System.out.println(str2.length());

   }
}
