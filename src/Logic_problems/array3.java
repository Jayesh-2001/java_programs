package Logic_problems;

import java.util.Scanner;

public class array3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      System.out.println("Enter 5 elements in array: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      array3.SortData(arr);
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   public static void SortData(int[] arr) {   // SELECTION SORT
      int min, pos;
      for (int i = 0; i < arr.length; i++) {
         min = arr[i];
         pos = i;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < min) {
               min = arr[j];
               pos = j;
            }
         }
         int temp = arr[pos];
         arr[pos] = arr[i];
         arr[i] = temp;
      }
   }
}
