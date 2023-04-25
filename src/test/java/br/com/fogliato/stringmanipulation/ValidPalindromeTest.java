package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    @Test
    public void case1() {
        String s = "A man, a plan, a canal: Panama";
        assertThat(new ValidPalindrome().isPalindrome(s)).isTrue();
    }

    @Test
    public void case2() {
        String s = "race a car";
        assertThat(new ValidPalindrome().isPalindrome(s)).isFalse();
    }

    @Test
    public void case3() {
        String s = " ";
        assertThat(new ValidPalindrome().isPalindrome(s)).isTrue();
    }
}