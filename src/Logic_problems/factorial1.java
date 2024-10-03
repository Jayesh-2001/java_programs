package Logic_problems;

public class factorial1 {
   public static int fact(int n) {
      int fact = 1;
      if (n == 0 || n == 1) {
         return fact;
      } else {
         for (int i = n; i > 1; i--) {
            fact *= i;
         }
      }
      return fact;
   }
   public static void main(String[] args) {
      int n = 6;
      System.out.println(fact(n));
   }
}
