package br.com.fogliato.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    public void case1() {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        assertThat(BubbleSort.bubbleSort(array)).containsExactly(2, 3, 5, 5, 6, 8);
    }
}