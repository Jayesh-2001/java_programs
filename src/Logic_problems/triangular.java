package Logic_problems;

public class triangular {
   public static void main(String[] args) {
      int lowest = 1;
      int highest = 100;
      int count = 0;

      for (int i = lowest; i <= highest; i++) {
         int num = i;

         while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 9) {
               count++;
            }
         }
      }
      System.out.println(count);
   }
}
