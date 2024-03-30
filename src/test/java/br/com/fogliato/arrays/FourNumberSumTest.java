package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FourNumberSumTest {

    @Test
    void case1() {
        int[] array = new int[]{ 7, 6, 4, -1, 1, 2 };
        int targetSum = 16;

        assertThat(FourNumberSum.fourNumberSum(array, targetSum))
                .contains(new Integer[]{ 7, 6, 4, -1 }, new Integer[]{ 7, 6, 1, 2 });
    }
}