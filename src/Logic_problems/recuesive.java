package Logic_problems;

public class recuesive {
   public static int fact(int n) {
      if (n == 0 || n==1) {
         return 1;
      }
      int facto = fact(n - 1);
      return n * facto;
   }

   public static void main(String[] args) {
      int n = 4;
      System.out.println(fact(n));
   }

}
