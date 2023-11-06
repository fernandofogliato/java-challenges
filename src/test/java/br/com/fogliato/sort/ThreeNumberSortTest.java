package br.com.fogliato.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeNumberSortTest {

    @Test
    public void case1() {
        int[] array = { 1, 0, 0, -1, -1, 0, 1, 1 };
        int[] order = { 0, 1, -1 };
        ThreeNumberSort.threeNumberSort(array, order);
        assertThat(array).containsExactly(0, 0, 0, 1, 1, 1, -1, -1);
    }
}