package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KadanesAlgorithmTest {

    @Test
    public void case1() {
        int[] array = new int[] { 3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4 };
        assertThat(KadanesAlgorithm.kadanesAlgorithm(array)).isEqualTo(19);
    }
}