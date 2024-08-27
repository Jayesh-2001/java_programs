package Logic_problems;

import java.util.Scanner;

public class array1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      System.out.println("Enter 5 elements in array: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("Enter number to be searched: ");
      int num = sc.nextInt();

      if (isFound(num, arr)) {
         System.out.println("Number is found in array");
      } else {
         System.out.println("Number is not present in array");

      }
   }

   private static boolean isFound(int num, int[] arr) {
      for (int i = 0; i < arr.length; i++) {    // LINEAR SEARCH
         if (arr[i] == num) {
            return true;
         }
      }
      return false;
   }
}
