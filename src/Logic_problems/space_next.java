package Logic_problems;

public class space_next {
   public static void main(String[] args) {
      String str = "PLEASE TALK IN ENGLISH";

      String arr[] = str.split(" ");
      int max_length = 7;

      for (int i = 0; i < arr.length; i++) {
         int len = arr[i].length();
         
         for (int j = 0; j < (max_length - len); j++) {
            System.out.print(" ");
         }
         for (int k = 0; k < len; k++) {
            System.out.print(arr[i].charAt(k));
         }
         System.out.println();
      }
      
   }
}
