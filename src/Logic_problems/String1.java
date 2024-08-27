package Logic_problems;

import java.util.Scanner;

public class String1 {

   public static void count_occ(String word1, char c) {
      int count = 0;

      char arr1[] = word1.toCharArray();
      int l = arr1.length;
      

      for (int i = 0; i < l; i++) {
         if (arr1[i] == c) {
            count++;
         }
      }
      System.out.println("count of "+c+" is: "+count);

      char arr2[] = new char[l];
      for (int i = 0; i < l; i++) {
         if (arr1[i] != c) {
               arr2[i] = arr1[i];        
         }
      }
      System.out.println(arr2);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a word: ");
      String word1 = sc.nextLine();
      System.out.println("Enter a character to find: ");
      char c = sc.next().charAt(0);

      count_occ(word1, c);

   }

}
