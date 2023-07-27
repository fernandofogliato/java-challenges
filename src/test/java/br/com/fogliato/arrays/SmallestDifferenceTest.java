package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestDifferenceTest {

    @Test
    public void case1() {
        int[] arrayOne = new int[] {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = new int[] {26, 134, 135, 15, 17};
        assertThat(SmallestDifference.smallestDifference(arrayOne, arrayTwo)).containsExactly(28, 26);
    }

    @Test
    public void case2() {
        int[] arrayOne = new int[] {-1, 5, 10, 20, 3};
        int[] arrayTwo = new int[] {26, 134, 135, 15, 17};
        assertThat(SmallestDifference.smallestDifference(arrayOne, arrayTwo)).containsExactly(20, 17);
    }
}