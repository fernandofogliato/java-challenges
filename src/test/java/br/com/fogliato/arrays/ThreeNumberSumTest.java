package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeNumberSumTest {

    @Test
    public void case1() {
        int[] array = new int[] { 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        assertThat(ThreeNumberSum.threeNumberSum(array, target))
                .containsExactly(new Integer[] {-8, 2, 6}, new Integer[] {-8, 3, 5}, new Integer[] {-6, 1, 5});
    }

    @Test
    public void case2() {
        int[] array = new int[] { 1, 2, 3 };
        int target = 6;
        assertThat(ThreeNumberSum.threeNumberSum(array, target))
                .containsExactly(new Integer[] {1, 2, 3});
    }

    @Test
    public void case3() {
        int[] array = new int[] { 1, 2, 3 };
        int target = 7;
        assertThat(ThreeNumberSum.threeNumberSum(array, target)).isEmpty();
    }
}