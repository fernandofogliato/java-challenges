package br.com.fogliato.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SameBstsTest {

    @Test
    void case1() {
       List<Integer> arrayOne = Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11);
       List<Integer> arrayTwo = Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81);
        Assertions.assertThat(SameBsts.sameBsts(arrayOne, arrayTwo)).isTrue();
    }
}