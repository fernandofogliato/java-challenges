package br.com.fogliato.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PermutationsTest {

    @Test
    public void case1() {
        List<Integer> array = Arrays.asList(1, 2, 3);
        List<List<Integer>> result = Permutations.getPermutations(array);
        Assertions.assertThat(result).contains(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1));
    }
}