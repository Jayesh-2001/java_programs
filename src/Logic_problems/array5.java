package Logic_problems;

import java.util.Scanner;

public class array5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      System.out.println("Enter 5 elements in array: ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      int count = 0, i;
      double sum = 0, average = 0;

      for (i = 0; i < arr.length; i++) {
         if (arr[i] % 2 != 0) {
            count++;
            System.out.println(arr[i]);
            sum += arr[i];
         }

      }
      average = sum / count;

      System.out.println(sum + " " + average);
   }
}
