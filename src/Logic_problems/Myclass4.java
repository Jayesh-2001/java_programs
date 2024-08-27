package Logic_problems;

public class Myclass4 {
   public static void main(String[] args) {

      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 5; j++) {
            if (j == i || i + j == 6) {
               System.out.print(i);
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
