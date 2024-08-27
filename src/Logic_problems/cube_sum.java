package Logic_problems;

public class cube_sum {
   public static void main(String[] args) {
      int a = 4, b = 9;
      int cube = 0, sum_cube = 0;
      
      for (int i = a; i <= b; i++) {
         cube = i * i * i;
         sum_cube += cube;
      }
      cube = 0;
      System.out.println(sum_cube);
   }
   
}
