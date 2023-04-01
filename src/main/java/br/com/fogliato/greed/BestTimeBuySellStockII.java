package br.com.fogliato.greed;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        var minimumBuyValue = prices[0];

        for (int i = 1; i < prices.length; i++) {
            var current = prices[i];
            if (current < minimumBuyValue) {
                minimumBuyValue = current;
                continue;
            }

            maxProfit += current - minimumBuyValue;
            minimumBuyValue = current;
        }
        return maxProfit;
    }
}
