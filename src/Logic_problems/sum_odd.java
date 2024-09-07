package Logic_problems;

public class sum_odd {
   public static void main(String[] args) {
      int arr[] = { 10, 3, 1, 5, 7, 6, 2, 4, 9,12,13 };
      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 2 != 0) {
            sum += arr[i];
         }
      }
      System.out.println(sum);
   }
}
