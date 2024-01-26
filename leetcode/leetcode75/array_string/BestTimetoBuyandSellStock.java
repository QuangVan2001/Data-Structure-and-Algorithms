package leetcode.leetcode75.array_string;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        // at beginning the minimum price is the first place
        int buyPrice = prices[0];

        // at the beginning the minimum profit is zero
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            // if the current price is less update the buyPrice
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }



    public static void main(String[] args) {
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{7,6,4,3,1}));



    }
}
