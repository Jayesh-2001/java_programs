package Logic_problems;

public class fibonacci {
   static int x = 0;
   static int y = 1;

   static void fib(int n) {
      int temp;
      temp = x + y;
      System.out.print(" "+temp);
      x = y;
      y = temp;
      n--;
      if (n > 2) {
         fib(n);
      }
   }
   public static void main(String[] args) {
      System.out.print(x + " " + y);
      fib(10);

   }
}
