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
}
