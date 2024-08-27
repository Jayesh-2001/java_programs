package Logic_problems;

public class Myclass1 {
   public static void main(String[] args) {
      int i, j, s, n = 1,r;
      for (i = 1; i <= 3; i++) {
         for (s = i; s < 3; s++)
            System.out.print(" ");
         for (j = 1; j <= n; j++) {
            if (j % 2 == 0)
               System.out.print("2");
            else
               System.out.print("1");
         }
         n = n + 2;
         System.out.println();
      }
      for (i = 2; i >= 1; i--) {
         for (s = i; s <= 2; s++) {
            System.out.print(" ");
         }
         for (j = 1; j <= i; j++) {
            System.out.print(j);
         }
         for (r = i - 1; r >= 1; r--) {
            System.out.println(r);
         }
      }
   }
}
