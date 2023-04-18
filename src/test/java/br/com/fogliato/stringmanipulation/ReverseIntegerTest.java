package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    @Test
    public void case1() {
        int x = 123;
        Assertions.assertThat(new ReverseInteger().reverse(x)).isEqualTo(321);
    }

    @Test
    public void case2() {
        int x = -123;
        Assertions.assertThat(new ReverseInteger().reverse(x)).isEqualTo(-321);
    }

    @Test
    public void case3() {
        int x = 120;
        Assertions.assertThat(new ReverseInteger().reverse(x)).isEqualTo(21);
    }

    @Test
    public void case4() {
        int x = 1534236469;
        Assertions.assertThat(new ReverseInteger().reverse(x)).isEqualTo(0);
    }
}