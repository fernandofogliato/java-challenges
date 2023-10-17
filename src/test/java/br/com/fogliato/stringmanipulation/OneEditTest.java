package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OneEditTest {

    @Test
    public void case1() {
        String s1 = "ab";
        String s2 = "b";
        Assertions.assertThat(OneEdit.oneEdit(s1, s2)).isTrue();
    }

    @Test
    public void case2() {
        String s1 = "abd";
        String s2 = "b";
        Assertions.assertThat(OneEdit.oneEdit(s1, s2)).isFalse();
    }

    @Test
    public void case3() {
        String s1 = "hello";
        String s2 = "h$llo";
        Assertions.assertThat(OneEdit.oneEdit(s1, s2)).isTrue();
    }
}