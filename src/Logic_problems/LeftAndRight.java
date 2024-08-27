package Logic_problems;

import java.util.Scanner;

public class LeftAndRight {
   public static void main(String[] args) { 

      Scanner sc = new Scanner(System.in);
      // int[] arr = { 2, 5, 7 };
      // int t = arr[arr.length - 1];
      // int i;
      // for (i = arr.length - 1; i > 0; i--) {                    //Right Shift
      //    arr[i] = arr[i - 1];
      // }

      // arr[i] = t;

      // for (int n : arr)
      //    System.out.print(n);

      int[] arr = { 2, 5, 7 };
      int t = arr[0];
      int i;
      for (i = 0; i < arr.length-1; i++) {                        //Left Shift
         arr[i] = arr[i + 1];
      }

      arr[i] = t;

      for (int n : arr)
         System.out.print(n);
   }

}
