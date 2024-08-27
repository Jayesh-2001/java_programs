package Logic_problems;

import java.util.Scanner;

public class prime {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int start = 10, end = 100;

      System.out.println("Prime numbers between " + start + " and " + end + ":");
      for (int i = start; i <= end; i++) {
         if (isPrime(i)) {
            System.out.print(i+" ");
         }
      }
   }

   public static boolean isPrime(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i * i <= num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}