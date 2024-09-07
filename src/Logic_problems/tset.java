package Logic_problems;

public class tset {
   public static void main(String[] args) {
      int maxLimit = 11;

      int count = 0;
      for (int i = 2; i <= maxLimit; i++) {

         if (i == 2) {
            count++;

            continue;
         }

         int flag = 0;

         for (int j = 2; j < i; j++) {
            if (i%j != 0) {
               continue;
            } else {
               flag = 1;
               break;
            }
         }
         if (flag == 0) {
            System.out.print(i + " ");
            count++;
         }

      }
      System.out.print("Final count = " + count);

   }
}
