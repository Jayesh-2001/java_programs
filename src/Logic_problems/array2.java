package Logic_problems;

import java.util.Scanner;

public class array2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      System.out.println("Enter 5 elements in array: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
   
      array2.SortData(arr);
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
      }
   }

   public static void SortData(int[] arr) {   // BUBBLE SORT
      for (int i = arr.length-1; i > 0; i--) {
         for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }
}
