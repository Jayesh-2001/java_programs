package Logic_problems;

public class singleLoop {
   public static void find_similar(int arr1[], int arr2[], int l1, int l2){
      int i = 0, j = 0;

      do {
         if (j < l2) {
            if (arr1[i] == arr2[j]) {
               System.out.println("Element " + arr1[i] + " is present in both arrays");
            }
         }
         j++;

         if (j == l2) {
            i++;
            j = 0;
         }
      } while (i<l1);
   }
   public static void main(String[] args) {
      int[] arr1 = { 1, 2, 3, 4, 5 };
      int[] arr2 = { 2, 5, 8 ,1 };
      int l1 = arr1.length;
      int l2 = arr2.length;

      find_similar(arr1, arr2, l1, l2);
   }
}
