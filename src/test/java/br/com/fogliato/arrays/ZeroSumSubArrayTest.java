package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZeroSumSubArrayTest {

    @Test
    public void case1() {
        int[] nums = {1, 1, 1};
        assertThat(ZeroSumSubArray.zeroSumSubArray(nums)).isFalse();
    }

    @Test
    public void case2() {
        int[] nums = {-1, -1, -1};
        assertThat(ZeroSumSubArray.zeroSumSubArray(nums)).isFalse();
    }

    @Test
    public void case3() {
        int[] nums = {-1, 2, 3, 4, -5, -3, 1, 2};
        assertThat(ZeroSumSubArray.zeroSumSubArray(nums)).isTrue();
    }
}