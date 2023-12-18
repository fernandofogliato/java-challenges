package br.com.fogliato.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestDigitsTest {

    @Test
    public void case1() {
        String number = "321";
        int numDigits = 1;
        assertThat(BestDigits.bestDigits(number, numDigits)).isEqualTo("32");
    }

    @Test
    public void case2() {
        String number = "462839";
        int numDigits = 2;
        assertThat(BestDigits.bestDigits(number, numDigits)).isEqualTo("6839");
    }
}