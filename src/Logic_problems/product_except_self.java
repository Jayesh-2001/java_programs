package Logic_problems;

import java.util.Arrays;

public class product_except_self {
   public static void main(String[] args) {
      int[] nums = { 1,2,3,4,5,6};
      int[] products = new int[nums.length];

      for (int i = 0; i < nums.length; i++) {
         int product = 1;
         for (int j = 0; j < nums.length; j++) {
            if (nums[i] !=nums[j]) {
               product *= nums[j];
            }
         }
         products[i] = product;
      }
      System.out.println(Arrays.toString(products));
   }
}
