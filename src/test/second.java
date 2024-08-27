package test;

import java.util.Scanner;

public class second {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a sentence: ");
      String sentence = sc.nextLine();
      System.out.println("Enter a word to count the occurances of : ");
      String word = sc.nextLine();

      int count = countOccurrences(sentence, word);

      System.out.println(word + " occurred " + count + " times");
   }

   public static int countOccurrences(String sentence, String word) {
      int count = 0;
      int index = 0;
      while ((index = sentence.indexOf(word, index)) != -1) {
         count++;
         index += word.length();
      }
      return count;
   }
}
