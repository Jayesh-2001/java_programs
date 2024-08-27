package Logic_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<Integer> index= new ArrayList<Integer>();

      int i, count = 0;
      int arr[] = new int[5];

      System.out.println("Enter the elements in the array: ");
      for (i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }

      System.out.println("Enter the number to be found: ");
      int num = sc.nextInt();

      for (i = 0; i < arr.length; i++) {
         if (arr[i] == num) {
            count++;
            index.add(i);
         }
      }
      System.out.println("Number of occurrences of the number: " + count);
      System.out.println("Indexes in array at which "+num+" is present is: "+index);

   }

}
