package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ValidSubsequenceTest {
    @Test
    public void case1() {
        List<Integer> array = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> sequence = Arrays.asList(1,6,-1,10);
        assertThat(ValidSubsequence.isValidSubsequence(array, sequence)).isTrue();
    }

    @Test
    public void case2() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        assertThat(ValidSubsequence.isValidSubsequence(array, sequence)).isTrue();
    }
}