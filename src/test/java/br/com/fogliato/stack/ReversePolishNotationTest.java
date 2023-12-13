package br.com.fogliato.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePolishNotationTest {

    @Test
    public void case1() {
        String[] tokens = new String[]{"4", "-7", "2", "6", "+", "10", "-", "/", "*", "2", "+", "3", "*"};
        assertThat(ReversePolishNotation.reversePolishNotation(tokens)).isEqualTo(42);
    }
}