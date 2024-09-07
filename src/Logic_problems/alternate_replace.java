package Logic_problems;

public class alternate_replace {
   public static void main(String[] args) {
      String str1 = "Virat.is.good.batsman";
      String str2 = "xyz";

      String arr[] = str1.split("\\.");

      for (int i = 0; i < arr.length; i++) {
         if (i % 2 != 0) {
            arr[i] = str2;
         }
      }
      String result = String.join(".", arr);
      System.out.println(result);

    
   }
}
