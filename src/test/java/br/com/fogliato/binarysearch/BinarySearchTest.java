package br.com.fogliato.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    public void case1() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        assertThat(new BinarySearch().search(nums, target)).isEqualTo(4);
    }

    @Test
    public void case2() {
        int[] nums = new int[] { -1,0,3,5,9,12 };
        int target = 2;
        assertThat(new BinarySearch().search(nums, target)).isEqualTo(-1);
    }

    @Test
    public void case3() {
        int[] nums = new int[] { 2,5 };
        int target = 2;
        assertThat(new BinarySearch().search(nums, target)).isZero();
    }
}