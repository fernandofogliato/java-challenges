package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonotonicArrayTest {

    @Test
    public void case1() {
        int[] array = new int[] { -1, -5, -10, -1100, -1100, -1101, -1102, -9001 };
        assertThat(MonotonicArray.isMonotonic(array)).isTrue();
    }

    @Test
    public void case2() {
        int[] array = new int[] {};
        assertThat(MonotonicArray.isMonotonic(array)).isTrue();
    }

    @Test
    public void case3() {
        int[] array = new int[] { 2, 1 };
        assertThat(MonotonicArray.isMonotonic(array)).isTrue();
    }

    @Test
    public void case4() {
        int[] array = new int[] { -1, -5, 10 };
        assertThat(MonotonicArray.isMonotonic(array)).isFalse();
    }
}