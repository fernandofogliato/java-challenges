package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LevenshteinDistanceTest {

    @Test
    public void case1() {
        String str1 = "cereal";
        String str2 = "saturdzz";

        assertThat(LevenshteinDistance.levenshteinDistance(str1, str2)).isEqualTo(7);
    }
}