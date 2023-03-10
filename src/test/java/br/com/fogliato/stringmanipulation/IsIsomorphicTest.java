package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsIsomorphicTest {

    @Test
    void case1() {
        String s = "egg";
        String t = "add";
        assertThat(IsIsomorphic.isIsomorphic(s, t)).isEqualTo(true);
    }

    @Test
    void case2() {
        String s = "foo";
        String t = "bar";
        assertThat(IsIsomorphic.isIsomorphic(s, t)).isEqualTo(false);
    }

    @Test
    void case3() {
        String s = "paper";
        String t = "title";
        assertThat(IsIsomorphic.isIsomorphic(s, t)).isEqualTo(true);
    }
}
