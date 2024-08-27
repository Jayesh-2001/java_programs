package Logic_problems;

import java.util.Scanner;

public class UniqueArray2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[5];
      int i,j,k,m,n;
      int l = arr.length;

      System.out.println("Enter elements in the array: ");
      for (m = 0; m < l; m++) {
         arr[m] = sc.nextInt();
      }
      System.out.println("Enter a number to remove: ");
      int num = sc.nextInt(); //Remove the occurance of num from array

      for (i = 0; i < l; i++) {
            if (arr[i] == num) {
               for (k = i; k < l-1; k++) {
                  arr[k] = arr[k + 1];
               }
               l--;
               i--;
            }        
      }
      for (n = 0; n < l; n++) {
         System.out.print(arr[n] + " ");
      }
   }
}
