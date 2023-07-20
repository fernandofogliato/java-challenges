package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonCharactersTest {

    @Test
    public void case1() {
        String[] test = new String[] { "abc", "bcd", "cbaccd" };
        assertThat(CommonCharacters.commonCharacters(test)).contains("b", "c");
    }

    @Test
    public void case2() {
        String[] test = new String[] { "abcde", "aa", "foobar", "foobaz", "and this is a string", "aaaaaaaa", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea" };
        assertThat(CommonCharacters.commonCharacters(test)).contains("a");
    }
}