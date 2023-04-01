package br.com.fogliato.greed;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeBuySellStockIITest {

    @Test
    public void case1() {
        int[] prices = {7,1,5,3,6,4};
        Assertions.assertThat(new BestTimeBuySellStockII().maxProfit(prices)).isEqualTo(7);
    }


    @Test
    public void case2() {
        int[] prices = {1,2,3,4,5};
        Assertions.assertThat(new BestTimeBuySellStockII().maxProfit(prices)).isEqualTo(4);
    }
}