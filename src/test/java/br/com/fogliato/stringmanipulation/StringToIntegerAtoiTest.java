package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringToIntegerAtoiTest {

    @Test
    public void case1() {
        String s = "42";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(42);
    }

    @Test
    public void case2() {
        String s = "   -42";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(-42);
    }

    @Test
    public void case3() {
        String s = "4193 with words";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(4193);
    }

    @Test
    public void case4() {
        String s = "words and 987";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isZero();
    }

    @Test
    public void case5() {
        String s = "9999999999999999";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    public void case6() {
        String s = "-9999999999999999";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    public void case7() {
        String s = "+-12";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isZero();
    }

    @Test
    public void case8() {
        String s = "-+12";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isZero();
    }

    @Test
    public void case9() {
        String s = "1";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(1);
    }

    @Test
    public void case10() {
        String s = "   ";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isZero();
    }

    @Test
    public void case11() {
        String s = "2147483648";
        Assertions.assertThat(new StringToIntegerAtoi().myAtoi(s)).isEqualTo(2147483647);
    }
}