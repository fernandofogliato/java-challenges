package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SemordnilapTest {

    @Test
    public void case1() {
        String[] words = new String[] { "diaper", "abc", "test", "cba", "repaid" };

        List<String> firstPairExpected = new ArrayList<>();
        firstPairExpected.add("diaper");
        firstPairExpected.add("repaid");

        List<String> secondPairExpected = new ArrayList<>();
        secondPairExpected.add("abc");
        secondPairExpected.add("cba");

        Assertions.assertThat(Semordnilap.semordnilap(words)).contains(firstPairExpected, secondPairExpected);
    }

    @Test
    public void case2() {
        String[] words = new String[] { "aaa", "bbbb" };
        Assertions.assertThat(Semordnilap.semordnilap(words)).isEmpty();
    }
}