package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RansonNoteTest {

    @Test
    public void case1() {
        var ransomNote = "a";
        var magazine = "b";
        assertThat(new RansonNote().canConstruct(ransomNote, magazine)).isFalse();
    }

    @Test
    public void case2() {
        var ransomNote = "aa";
        var magazine = "ab";
        assertThat(new RansonNote().canConstruct(ransomNote, magazine)).isFalse();
    }

    @Test
    public void case3() {
        var ransomNote = "aa";
        var magazine = "aab";
        assertThat(new RansonNote().canConstruct(ransomNote, magazine)).isTrue();
    }

    @Test
    public void case4() {
        var ransomNote = "aab";
        var magazine = "baa";
        assertThat(new RansonNote().canConstruct(ransomNote, magazine)).isTrue();
    }
}