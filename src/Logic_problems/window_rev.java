package Logic_problems;

import java.util.Arrays;

public class window_rev {
   public static void reverse(int arr[], int chunk) {
      for (int i = 0; i < arr.length; i += chunk) {
         int start = i;
         int end = i + chunk - 1;

         while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
      }
      System.out.println(Arrays.toString(arr));
   }

   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12 };
      int chunk = 4;
      reverse(arr, chunk);
   }
}
