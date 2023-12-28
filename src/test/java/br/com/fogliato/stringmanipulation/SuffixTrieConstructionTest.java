package br.com.fogliato.stringmanipulation;

import br.com.fogliato.stringmanipulation.SuffixTrieConstruction.SuffixTrie;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SuffixTrieConstructionTest {

    @Test
    public void case1() {
        String string = "babc";
        SuffixTrie suffixTrie = new SuffixTrie(string);
        assertThat(suffixTrie.contains("abc")).isTrue();
    }

    @Test
    public void case2() {
        String string = "test";
        SuffixTrie suffixTrie = new SuffixTrie(string);
        assertThat(suffixTrie.contains("t")).isTrue();
        assertThat(suffixTrie.contains("st")).isTrue();
        assertThat(suffixTrie.contains("est")).isTrue();
        assertThat(suffixTrie.contains("tes")).isFalse();
    }
}