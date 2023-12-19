package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumCharactersForWordsTest {

    @Test
    public void case1() {
        String[] words = new String[]{ "this", "that", "did", "deed", "them!", "a" };
        char[] result = MinimumCharactersForWords.minimumCharactersForWords(words);
        assertThat(result).contains('a', '!', 's', 't', 't', 'd', 'd', 'e', 'e', 'h', 'i', 'm');
    }
}