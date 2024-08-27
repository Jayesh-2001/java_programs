package Logic_problems;

public class array7 {
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 3, 4, 4, 4 };
      int l = arr.length;
      int count;

      for (int i = 0; i < l; i++) {
         count = 1;
         for (int j = i + 1; j < l; j++) {
            if (arr[i] == arr[j]) {
               count++;
            }
         }
         if (count > 1) {
            System.out.println(arr[i] + " occurs " + count + " times");
         }
      }
   }
}
