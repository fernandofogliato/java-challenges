package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakingAnagramsTest {

    @Test
    void makingAnagrams_4DeletedChars() {
        String a = "cde";
        String b = "abc";
        int countDeleteChars = MakingAnagrams.makeAnagram(a, b);
        assertThat(countDeleteChars).isEqualTo(4);
    }

    @Test
    void makingAnagrams_30DeletedChars() {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int countDeleteChars = MakingAnagrams.makeAnagram(a, b);
        assertThat(countDeleteChars).isEqualTo(30);
    }
}
