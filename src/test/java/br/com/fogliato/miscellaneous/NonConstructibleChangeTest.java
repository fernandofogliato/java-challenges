package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NonConstructibleChangeTest {

    @Test
    public void case1() {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        assertThat(new NonConstructibleChange().nonConstructibleChange(coins)).isEqualTo(20);
    }

    @Test
    public void case2() {
        int[] coins = { 1, 1, 4 };
        assertThat(new NonConstructibleChange().nonConstructibleChange(coins)).isEqualTo(3);
    }
}