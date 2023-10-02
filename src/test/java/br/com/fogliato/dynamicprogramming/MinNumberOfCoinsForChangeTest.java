package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinNumberOfCoinsForChangeTest {

    @Test
    public void case1() {
        int n = 7;
        int[] denoms = { 1, 5, 10 };
        assertThat(MinNumberOfCoinsForChange.minNumberOfCoinsForChange(n, denoms)).isEqualTo(3);
    }

    @Test
    public void case2() {
        int n = 7;
        int[] denoms = { 1, 10, 5 };
        assertThat(MinNumberOfCoinsForChange.minNumberOfCoinsForChange(n, denoms)).isEqualTo(3);
    }

    @Test
    public void case3() {
        int n = 0;
        int[] denoms = { 1, 2, 3 };
        assertThat(MinNumberOfCoinsForChange.minNumberOfCoinsForChange(n, denoms)).isEqualTo(0);
    }
}