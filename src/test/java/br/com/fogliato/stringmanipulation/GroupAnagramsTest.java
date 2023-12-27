package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    @Test
    public void case1() {
        List<String> words = Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        assertThat(GroupAnagrams.groupAnagrams(words)).contains(
                Arrays.asList("yo", "oy"),
                Arrays.asList("flop", "olfp"),
                Arrays.asList("act", "tac", "cat"),
                Collections.singletonList("foo")
        );
    }

    @Test
    public void case2() {
        List<String> words = new ArrayList<>();
        assertThat(GroupAnagrams.groupAnagrams(words)).isEmpty();
    }
}