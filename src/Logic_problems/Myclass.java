package Logic_problems;

public class Myclass {
   public static void main(String[] args) {
      int i, j, s, r;
      for (i = 1; i <= 3; i++) {
         for (s = i; s <= 2; s++)
            System.out.print(" ");
         for (j = 1; j <= i; j++)
            System.out.print(j);
         for (r = i - 1; r >= 1; r--)
            System.out.print(r);
         System.out.print("\n");
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
