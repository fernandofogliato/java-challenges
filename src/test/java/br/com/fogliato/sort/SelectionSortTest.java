package br.com.fogliato.sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    @Test
    public void case1() {
        int[] array = { 8, 5, 2, 9, 5, 6, 3 };
        Assertions.assertThat(SelectionSort.selectionSort(array)).containsExactly(2, 3, 5, 5, 6, 8, 9);
    }
}