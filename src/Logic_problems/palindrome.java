package Logic_problems;

public class palindrome {
   public static void main(String[] args) {
      String str = "1331";
      System.out.println(str+" is Palindrome: "+isPalindrome(str));
   }

   private static boolean isPalindrome(String str) {
      String str1 = "";
      int l = str.length();

      for (int i = l-1; i >= 0; i--) {
         str1 += str.charAt(i);
      }
      return str.equals(str1);
   }
}
