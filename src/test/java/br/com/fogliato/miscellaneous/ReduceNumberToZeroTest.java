package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReduceNumberToZeroTest {

    @Test
    public void case1() {
        int num = 14;
        assertThat(new ReduceNumberToZero().numberOfSteps(num)).isEqualTo(6);
    }

    @Test
    public void case2() {
        int num = 8;
        assertThat(new ReduceNumberToZero().numberOfSteps(num)).isEqualTo(4);
    }

    @Test
    public void case3() {
        int num = 123;
        assertThat(new ReduceNumberToZero().numberOfSteps(num)).isEqualTo(12);
    }
}