package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedSquaredArrayTest {

    @Test
    public void case1() {
        int[] array = { -5, -4, -3, -2, -1 };
        assertThat(new SortedSquaredArray().sortedSquaredArray(array)).containsExactly(1, 4, 9, 16, 25);
    }
}