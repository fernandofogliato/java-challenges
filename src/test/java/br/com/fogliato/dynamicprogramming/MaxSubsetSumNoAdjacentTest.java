package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxSubsetSumNoAdjacentTest {

    @Test
    public void case1() {
        int[] array = new int[] { 75, 105, 120, 75, 90, 135 };
        assertThat(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(array)).isEqualTo(330);
    }
}