package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxArraySumTest {

    @Test
    void maxSubsetSum_13() {
        int sumSubSet = MaxArraySum.maxSubsetSum(new int[] { 3, 7, 4, 6, 5 });
        assertThat(sumSubSet).isEqualTo(13);
    }

    @Test
    void maxSubsetSum_11() {
        int sumSubSet = MaxArraySum.maxSubsetSum(new int[] { 2, 1, 5, 8, 4 });
        assertThat(sumSubSet).isEqualTo(11);
    }

    @Test
    void maxSubsetSum_15() {
        int sumSubSet = MaxArraySum.maxSubsetSum(new int[] { 3, 5, -7, 8, 10 });
        assertThat(sumSubSet).isEqualTo(15);
    }
}