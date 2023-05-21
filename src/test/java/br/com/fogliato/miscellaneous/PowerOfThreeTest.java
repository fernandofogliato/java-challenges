package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfThreeTest {

    @Test
    public void case1() {
        int n = 27;
        assertThat(new PowerOfThree().isPowerOfThree(n)).isTrue();
    }

    @Test
    public void case2() {
        int n = 0;
        assertThat(new PowerOfThree().isPowerOfThree(n)).isFalse();
    }

    @Test
    public void case3() {
        int n = -1;
        assertThat(new PowerOfThree().isPowerOfThree(n)).isFalse();
    }
}