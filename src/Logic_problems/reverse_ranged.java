package Logic_problems;

public class reverse_ranged {
   public static void reverse(int arr[], int start, int end) {
      for (int i = 0; i < start; i++) {
         System.out.print(arr[i]+" ");
      }
      for (int i = end; i >= start; i--) {
         System.out.print(arr[i] + " ");
      }
      for (int i = end+1; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5, 6 };
      int start = 2;
      int end = 4;

      reverse(arr, start, end);
   }
}
