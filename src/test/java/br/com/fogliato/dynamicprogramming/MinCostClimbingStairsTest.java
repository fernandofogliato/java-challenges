package br.com.fogliato.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

    @Test
    public void case1() {
        int[] cost = new int[] { 10, 15, 20 };
        Assertions.assertThat(new MinCostClimbingStairs().minCostClimbingStairs(cost)).isEqualTo(15);
    }

    @Test
    public void case2() {
        int[] cost = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        Assertions.assertThat(new MinCostClimbingStairs().minCostClimbingStairs(cost)).isEqualTo(6);
    }

    @Test
    public void case3() {
        int[] cost = new int[] { 0, 1, 2, 2 };
        Assertions.assertThat(new MinCostClimbingStairs().minCostClimbingStairs(cost)).isEqualTo(2);
    }
}