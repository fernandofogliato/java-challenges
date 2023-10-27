package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInStringTest {

    @Test
    public void case1() {
        String string = "Algoexpert is the best!";
        assertThat(ReverseWordsInString.reverseWordsInString(string)).isEqualTo("best! the is Algoexpert");
    }
}