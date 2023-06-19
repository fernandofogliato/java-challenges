package br.com.fogliato.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOf1BitsTest {

    @Test
    public void case1() {
        int n = 00000000000000000000000000001011;
        Assertions.assertThat(new NumberOf1Bits().hammingWeight(n)).isEqualTo(3);
    }

    @Test
    public void case2() {
        int n = 00000000000000000000000010000000;
        Assertions.assertThat(new NumberOf1Bits().hammingWeight(n)).isEqualTo(1);
    }
}