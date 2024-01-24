package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromicSubstringTest {

    @Test
    public void case1() {
        String string = "abaxyzzyxf";
        assertThat(LongestPalindromicSubstring.longestPalindromicSubstring(string)).isEqualTo("xyzzyx");
    }
}