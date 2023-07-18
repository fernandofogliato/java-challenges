package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RunLengthEncodingTest {

    @Test
    public void case1() {
        String test = "AAAAAAAAAAAAABBCCCCDD";
        assertThat(RunLengthEncoding.runLengthEncoding(test)).isEqualTo("9A4A2B4C2D");
    }

    @Test
    public void case2() {
        String test = "                          ";
        assertThat(RunLengthEncoding.runLengthEncoding(test)).isEqualTo("9 9 8 ");
    }

    @Test
    public void case3() {
        String test = " ";
        assertThat(RunLengthEncoding.runLengthEncoding(test)).isEqualTo("1 ");
    }
}