package br.com.fogliato.greed;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minimumBuyValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minimumBuyValue) {
                minimumBuyValue = currentPrice;
                continue;
            }

            int profit = currentPrice - minimumBuyValue;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
