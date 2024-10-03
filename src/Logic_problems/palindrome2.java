package Logic_problems;

public class palindrome2 {
   public static void main(String[] args) {
      String str = "133331";
      int l = str.length();
      int flag=0;

      for (int i = 0; i < l / 2; i++) {
         if (str.charAt(i) != str.charAt(l - 1 - i)) {
            flag = 1;
            break;
         }
      }
      if (flag == 0) {
         System.out.println(str+" is palindrome");
      } else {
         System.out.println(str + " is not palindrome");

      }

   }
}
