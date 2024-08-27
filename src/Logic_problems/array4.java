package Logic_problems;

import java.util.Scanner;

public class array4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      System.out.println("Enter 5 elements in array: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      array4.SortData(arr);
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   
   public static void SortData(int[] arr) {   // INSERTION SORT
      int i, j, n;
      for (i = 0; i < arr.length - 1; i++) {
         n = arr[i + 1];
         j = i + 1;
         while (j > 0 && arr[j - 1] > n) {
            arr[j] = arr[j - 1];
            j--;
         }
         arr[j] = n;
      }
   }
}
