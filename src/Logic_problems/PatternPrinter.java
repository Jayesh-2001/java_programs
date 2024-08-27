package Logic_problems;

import java.util.Scanner;

public class PatternPrinter {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int rows = scanner.nextInt();

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < rows-i ; j++) {
            System.out.print("  ");
         }

         for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print(" "+k);
         }

         System.out.println();
      }
   }
}
