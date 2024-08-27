package Logic_problems;

public class UniqueArray {
   public static void main(String[] args) {
      int arr[] = {12,10,52,10,10,25,10};
      int i, j,k;
      int l = arr.length;

      for (i = 0; i < l; i++) {
         for (j = i + 1; j < l; j++) {
            if (arr[i] == arr[j]) {
               for (k = j; k < l-1; k++) {
                  arr[k] = arr[k + 1];
               }
               l--;
               j--; //needs when two same elements are next to each otherzzz
            }
         }
      }
      for (int m = 0; m < l; m++) {
         System.out.print(arr[m] + " ");
      }
   }
}
