package Logic_problems;

public class find_numbers {
   public static void moreThanTimes(int arr[], int l) {
      int count1 = 0;
      int count2 = 0;

      int n1 = arr[0], n2;
      if (arr[1] != n1) {
         n2 = arr[1];
      } else {
         n2 = arr[2];
      }
      for (int i = 0; i < l; i++) {
         if (arr[i] == n1) {
            count1++;
         }
         if (arr[i] == n2) {
            count2++;
         }
      }
      if (count1 > l / 3) {
         System.out.println(n1);
      }
      if (count2 > l / 3) {
         System.out.println(n2);
      }
   }

   public static void main(String[] args) {
      int[] arr = { 3, 2, 1, 2, 1, 2, 1, 2, 1 };
      int l = arr.length;

      moreThanTimes(arr, l);
   }
}
