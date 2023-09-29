package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfWaysToMakeChangeTest {

    @Test
    public void case1() {
        int[] denoms = { 1, 5, 10, 25 };
        int n = 10;
        assertThat(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(n, denoms)).isEqualTo(4);
    }
}