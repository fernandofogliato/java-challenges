package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsSubsequenceTest {

    @Test
    void case1() {
        String s = "abc";
        String t = "ahbgdc";
        assertThat(IsSubsequence.isSubsequence(s, t)).isTrue();
    }

    @Test
    void case2() {
        String s = "axc";
        String t = "ahbgdc";
        assertThat(IsSubsequence.isSubsequence(s, t)).isFalse();
    }

    @Test
    void case3() {
        String s = "acb";
        String t = "ahbgdc";
        assertThat(IsSubsequence.isSubsequence(s, t)).isFalse();
    }
}
