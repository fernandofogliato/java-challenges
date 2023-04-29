package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NeedHaystackTest {

    @Test
    public void case1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isZero();
    }

    @Test
    public void case2() {
        String haystack = "leetcode";
        String needle = "leeto";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isEqualTo(-1);
    }

    @Test
    public void case3() {
        String haystack = "hello";
        String needle = "ll";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isEqualTo(2);
    }

    @Test
    public void case4() {
        String haystack = "a";
        String needle = "a";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isZero();
    }

    @Test
    public void case5() {
        String haystack = "abc";
        String needle = "c";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isEqualTo(2);
    }

    @Test
    public void case6() {
        String haystack = "mississippi";
        String needle = "issi";
        assertThat(new NeedHaystack().strStr(haystack, needle)).isEqualTo(1);
    }
}