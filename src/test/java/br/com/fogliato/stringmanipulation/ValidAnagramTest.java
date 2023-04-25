package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    @Test
    public void case1() {
        String s = "anagram";
        String t = "nagaram";
        assertThat(new ValidAnagram().isAnagram(s, t)).isTrue();
    }

    @Test
    public void case2() {
        String s = "rat";
        String t = "car";
        assertThat(new ValidAnagram().isAnagram(s, t)).isFalse();
    }

    @Test
    public void case3() {
        String s = "a";
        String t = "ab";
        assertThat(new ValidAnagram().isAnagram(s, t)).isFalse();
    }
}