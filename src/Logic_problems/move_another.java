package Logic_problems;

import java.util.Arrays;

public class move_another {
   public static void main(String[] args) {
      int arr[] = { 1, 3, 5, 9, 15 };
      int highest = arr[0], se_highest=0;

      int arr2[] = new int[2];

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > highest) {
            se_highest = highest;
            highest = arr[i];

         }
      }
      arr2[0] = highest;
      arr2[1] = se_highest;

      System.out.println(Arrays.toString(arr2));

   }
}
