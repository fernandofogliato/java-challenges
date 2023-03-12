package br.com.fogliato.greed;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeBuySellStockTest {

    @Test
    void case1() {
        int[] prices = new int[]{ 7, 1, 5, 3, 6, 4};
        assertThat(BestTimeBuySellStock.maxProfit(prices)).isEqualTo(5);
    }

    @Test
    void case2() {
        int[] prices = new int[]{ 7, 6, 4, 3, 1 };
        assertThat(BestTimeBuySellStock.maxProfit(prices)).isZero();
    }
}