package Logic_problems;
import static java.lang.System.out;

public class Myclass3 {
   public static void main(String[] args) {
      int i, j, s, r;
      for (i = 0; i < 4; i++) {
         for (s = i; s < 3; s++)
            out.print(" ");
         for (j = i; j >= 0; j--)
            out.print(j);
         for (r = 1; r <= i; r++)
            out.print(r);

         out.print("\n");
      }
   }
}
