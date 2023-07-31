package br.com.fogliato.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPeakTest {

    @Test
    public void case1() {
        int[] array = new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };
        Assertions.assertThat(LongestPeak.longestPeak(array)).isEqualTo(6);
    }

    @Test
    public void case2() {
        int[] array = new int[] { 1, 3, 2 };
        Assertions.assertThat(LongestPeak.longestPeak(array)).isEqualTo(3);
    }
}