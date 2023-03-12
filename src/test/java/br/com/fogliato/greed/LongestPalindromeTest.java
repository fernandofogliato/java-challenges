package br.com.fogliato.greed;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromeTest {

    @Test
    void case1() {
        String s = "abccccdd";
        assertThat(LongestPalindrome.longestPalindrome(s)).isEqualTo(7);
    }

    @Test
    void case2() {
        String s = "a";
        assertThat(LongestPalindrome.longestPalindrome(s)).isEqualTo(1);
    }

    @Test
    void case3() {
        String s = "bb";
        assertThat(LongestPalindrome.longestPalindrome(s)).isEqualTo(2);
    }

    @Test
    void case4() {
        String s = "bananas";
        assertThat(LongestPalindrome.longestPalindrome(s)).isEqualTo(5);
    }
}