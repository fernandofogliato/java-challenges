package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    @Test
    public void case1() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = {2, 5, 6 };
        int m = 3;
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    public void case2() {
        int[] nums1 = { 1 };
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(1);
    }

    @Test
    public void case3() {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        int m = 0;
        int n = 1;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(1);
    }

    @Test
    public void case4() {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        int m = 1;
        int n = 1;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(1, 2);
    }

    @Test
    public void case5() {
        int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = { 1, 2, 3 };
        int m = 3;
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(1, 2, 3, 4, 5, 6);
    }
}