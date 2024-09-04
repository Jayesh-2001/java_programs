package Logic_problems;

public class character {
   public static void main(String[] args) {
      String arr[] = { "A00", "0B0", "0C0", "Z97", " 8U5", "C66" };

      for (int i = 0; i < arr.length; i++) {
         if (!arr[i].isEmpty() && Character.isLetter(arr[i].charAt(0))) {
            System.out.println(arr[i]);
         }
      }
   }
}