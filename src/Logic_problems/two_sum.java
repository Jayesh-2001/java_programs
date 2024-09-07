package Logic_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
   public static int[] twoSum(int arr[], int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < arr.length; i++) {
         int complement = target - arr[i];
         if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
         }
         map.put(arr[i], i);
         
      }
      return null;
   }
   public static void main(String[] args) {
      int arr[] = { 3, 5,5,11,15 };
      int target = 10;
      
      System.out.println(Arrays.toString(twoSum(arr, target))); 
   }
}