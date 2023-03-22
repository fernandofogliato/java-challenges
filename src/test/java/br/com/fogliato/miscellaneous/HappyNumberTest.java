package br.com.fogliato.miscellaneous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

    @Test
    public void case1() {
        int n = 19;
        Assertions.assertThat(new HappyNumber().isHappy(n)).isTrue();
    }

    @Test
    public void case2() {
        int n = 2;
        Assertions.assertThat(new HappyNumber().isHappy(n)).isFalse();
    }

    @Test
    public void case3() {
        int n = 7;
        Assertions.assertThat(new HappyNumber().isHappy(n)).isTrue();
    }

    @Test
    public void case4() {
        int n = 3;
        Assertions.assertThat(new HappyNumber().isHappy(n)).isFalse();
    }
}