package Logic_problems;

public class alternate_char {
   public static void print(char ch) {
      char currentChar = ch;

      do {
         System.out.print(currentChar + " ");
         currentChar += 2; 

         if (currentChar > 'z') {
            currentChar =(char) (currentChar - 26);
         }

         if (currentChar > 'Z') {
            currentChar = (char) (currentChar - 26); 
         }

      } while (currentChar != ch);
   }
   public static void main(String[] args) {
      char ch= 'L';

      print(ch);
   }
}
