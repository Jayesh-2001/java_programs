package Logic_problems;

public class String2 {
   public static void main(String[] args) {
      String str = "010110111111010111111110001010111"; // print the count of 1 in longest substring of 1
      int c1 = 0, c2 = 0;
      int l = str.length();

      char arr[] = str.toCharArray();

      for (int i = 0; i < l; i++) {
         if (arr[i] == '1') {
            c2++;
         } else {
            if (c2 > c1) {
               c1 = c2;
            }
            c2 = 0;
         }
      }
      if (c2 > c1) {
         c1 = c2; 
      }
      if (c1 == 0) {
         System.out.println(-1);
      } else {
         System.out.println(c1);
      }

   }
}
