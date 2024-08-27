package Logic_problems;

public class sorted3 {
   public static void main(String[] args) {
      int[] arr1 = { 2, 8, 65, 85, 97 };
      int[] arr2 = { 1, 9, 25, 68, 93 };
      int l1 = arr1.length, l2 = arr2.length;
      
      int[] arr3 = new int[l1 + l2];
      int l3 = l1 + l2;

      int i, j, k;

      for (i = 0; i < l1; i++) {
         arr3[i] = arr1[i];
      }
      for (j = 0; j < l2; j++) {
         arr3[j + i] = arr2[j];
      }

      for (i = 0; i < l3; i++) {
         for (j = i + 1; j < l3; j++) {
            if (arr3[i] > arr3[j]) {
               int temp = arr3[i];
               arr3[i] = arr3[j];
               arr3[j] = temp;
            }
         }
      }
      for (k = 0; k < l3; k++) {
         System.out.print(arr3[k] + " ");
      }
   }
}
