package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    public void case1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(s);
        Assertions.assertThat(s).containsExactly('o','l','l','e','h');
    }

    @Test
    public void case2() {
        char[] s = {'H','a','n','n','a','h'};
        new ReverseString().reverseString(s);
        Assertions.assertThat(s).containsExactly('h','a','n','n','a','H');
    }
}