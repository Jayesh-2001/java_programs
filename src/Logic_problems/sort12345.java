package Logic_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sort12345 {
   public static void main(String[] args) {
      int arr[] = { 3, 5, 2, 2, 2, 18, 9, 2, 0, 6, 3, 1, 3, 5, 6, 7, 18, 9, 19, 8, 7, 8, 8, 16, 11, 12, 12, 3, 13, 1,
            11, 16, 19, 5, 18, 14, 10 };
      int i, j, k;
      int l = arr.length;

      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      Map<Integer, Integer> map = new HashMap<>();

      for (int num : arr) {
        
         map.put(num, map.getOrDefault(num, 0)+1);

      } 
      
   }
}
