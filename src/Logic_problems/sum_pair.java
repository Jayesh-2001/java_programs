package Logic_problems;

public class sum_pair {

   public static void has_pair(int arr[], int target) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
               System.out.println("["+arr[i]+", "+arr[j]+"]");
            }
         }
      }

   }
   public static void main(String[] args) {
      int arr[] = { 1,3, 4, 5, 6, 8 };
      int target = 9;

      has_pair(arr, target);
   }
}
