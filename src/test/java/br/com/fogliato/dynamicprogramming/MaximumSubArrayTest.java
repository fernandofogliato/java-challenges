package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubArrayTest {

    @Test
    public void case1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertThat(new MaximumSubArray().maxSubArray(nums)).isEqualTo(6);
    }

    @Test
    public void case2() {
        int[] nums = {1};
        assertThat(new MaximumSubArray().maxSubArray(nums)).isEqualTo(1);
    }

    @Test
    public void case3() {
        int[] nums = { 5, 4, -1, 7, 8};
        assertThat(new MaximumSubArray().maxSubArray(nums)).isEqualTo(23);
    }
}