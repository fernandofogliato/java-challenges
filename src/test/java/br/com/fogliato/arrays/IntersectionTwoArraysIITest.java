package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionTwoArraysIITest {

    @Test
    public void case1() {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        assertThat(new IntersectionTwoArraysII().intersect(nums1, nums2)).containsExactly(2, 2);
    }

    @Test
    public void case2() {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        assertThat(new IntersectionTwoArraysII().intersect(nums1, nums2)).containsExactly(4, 9);
    }

    @Test
    public void case3() {
        int[] nums1 = { 3, 1, 2 };
        int[] nums2 = { 1, 1 };
        assertThat(new IntersectionTwoArraysII().intersect(nums1, nums2)).containsExactly(1);
    }
}