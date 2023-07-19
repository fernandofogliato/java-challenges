package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonCharactersTest {

    @Test
    public void case1() {
        String[] test = new String[] { "abc", "bcd", "cbaccd" };
        assertThat(CommonCharacters.commonCharacters(test)).contains("b", "c");
    }
}