package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    public void case1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        assertThat(new TwoSum().twoSum(nums, target)).containsExactly(0, 1);
    }

    @Test
    public void case2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        assertThat(new TwoSum().twoSum(nums, target)).containsExactly(1, 2);
    }

    @Test
    public void case3() {
        int[] nums = { 3, 3 };
        int target = 6;
        assertThat(new TwoSum().twoSum(nums, target)).containsExactly(0, 1);
    }

    @Test
    public void case4() {
        int[] nums = { 3, 2, 3 };
        int target = 6;
        assertThat(new TwoSum().twoSum(nums, target)).containsExactly(0, 2);
    }
}