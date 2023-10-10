package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleCycleCheckTest {

    @Test
    public void case1() {
        int[] array = { 2, 3, 1, -4, -4, 2 };
        assertThat(SingleCycleCheck.hasSingleCycle(array)).isTrue();
    }

    @Test
    public void case2() {
        int[] array = { 0, 1, 1, 1, 1 };
        assertThat(SingleCycleCheck.hasSingleCycle(array)).isFalse();
    }
}