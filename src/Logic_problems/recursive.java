package Logic_problems;

public class recursive {
   public static void call(int n) {
      if (n == 5)
         return;
      n++;
      call(n);
      System.out.println(n);
   }

   public static void main(String[] args) {
      int no = 0;
      call(no);
   }
}
