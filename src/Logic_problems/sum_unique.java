package Logic_problems;

public class sum_unique {
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 3, 3, 4, 2, 5, 3, 4 };
      int l = arr.length;
      int i, j, k;
      int sum = 0;

      for (i = 0; i < l; i++) {
         for (j = i + 1; j < l; j++) {
            if (arr[i] == arr[j]) {
               for (k = j; k < l - 1; k++) {
                  arr[k] = arr[k + 1];
               }
               l--;
               j--;
            }
         }
      }
      for (i = 0; i < l; i++) {
         sum += arr[i];
      }
      System.out.println(sum);
   }
}
