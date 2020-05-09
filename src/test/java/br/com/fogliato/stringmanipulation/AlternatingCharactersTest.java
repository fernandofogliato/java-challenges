package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlternatingCharactersTest {

    @Test
    void alternatingCharacters_3Deletions_AAAA() {
        int deletions = AlternatingCharacters.alternatingCharacters("AAAA");
        assertThat(deletions).isEqualTo(3);
    }

    @Test
    void alternatingCharacters_4Deletions_BBBBB() {
        int deletions = AlternatingCharacters.alternatingCharacters("BBBBB");
        assertThat(deletions).isEqualTo(4);
    }

    @Test
    void alternatingCharacters_0Deletions_ABABABAB() {
        int deletions = AlternatingCharacters.alternatingCharacters("ABABABAB");
        assertThat(deletions).isEqualTo(0);
    }

    @Test
    void alternatingCharacters_0Deletions_BABABA() {
        int deletions = AlternatingCharacters.alternatingCharacters("BABABA");
        assertThat(deletions).isEqualTo(0);
    }

    @Test
    void alternatingCharacters_4Deletions_AAABBB() {
        int deletions = AlternatingCharacters.alternatingCharacters("AAABBB");
        assertThat(deletions).isEqualTo(4);
    }
}
