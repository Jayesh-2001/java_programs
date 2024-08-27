package Logic_problems;

import java.util.Arrays;

public class sort012 {

   public static void main(String[] args) {
      int arr[] = { 0, 1, 2, 1, 0, 2, 1, 0, 2, 0, 2, 1, 2, 0 };
      int count_0 = 0;
      int count_1 = 0;
      int count_2 = 0;
      int i, j, k;

      for (i = 0; i < arr.length; i++) {
         if (arr[i] == 0) {
            count_0++;
         }
         if (arr[i] == 1) {
            count_1++;
         }
         if (arr[i] == 2) {
            count_2++;
         }
      }
      for (i = 0; i < count_0; i++) {
         arr[i] = 0;
      }
      for (j = 0; j < count_1; j++) {
         arr[j + count_0] = 1;
      }
      for (k = 0; k < count_2; k++) {
         arr[k + count_0 + count_1] = 2;
      }

      System.out.println(Arrays.toString(arr));

      System.out.println(count_0 + " " + count_1 + " " + count_2);
   }
}
