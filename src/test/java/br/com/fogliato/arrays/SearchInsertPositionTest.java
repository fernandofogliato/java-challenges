package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    @Test
    public void case1() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        assertThat(new SearchInsertPosition().searchInsert(nums, target)).isEqualTo(2);
    }

    @Test
    public void case2() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        assertThat(new SearchInsertPosition().searchInsert(nums, target)).isEqualTo(1);
    }

    @Test
    public void case3() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        assertThat(new SearchInsertPosition().searchInsert(nums, target)).isEqualTo(4);
    }
}