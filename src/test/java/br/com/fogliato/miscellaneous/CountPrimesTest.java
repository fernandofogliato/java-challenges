package br.com.fogliato.miscellaneous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CountPrimesTest {

    @Test
    public void case1() {
        int n = 30;
        Assertions.assertThat(new CountPrimes().countPrimes(n)).isEqualTo(10);
    }

    @Test
    public void case2() {
        int n = 0;
        Assertions.assertThat(new CountPrimes().countPrimes(n)).isZero();
    }

    @Test
    public void case3() {
        int n = 1;
        Assertions.assertThat(new CountPrimes().countPrimes(n)).isZero();
    }
}