package Logic_problems;

public class best_time_buy_sell {
   public static int maxProfit(int[] prices) {
      if (prices == null || prices.length == 0) {
         return 0;
      }

      int minPrice = Integer.MAX_VALUE;
      int maxProfit = 0;

      for (int i = 0; i < prices.length; i++) {
         if (prices[i] < minPrice) {
            minPrice = prices[i];
         }
         int profit = prices[i] - minPrice;
         if (profit > maxProfit) {
            maxProfit = profit;
         }
      }

      return maxProfit;
   }
   public static void main(String[] args) {
      int[] prices = { 7, 1, 5, 3, 10, 4 };
      System.out.println("Maximum Profit: " + maxProfit(prices));
   }
}
