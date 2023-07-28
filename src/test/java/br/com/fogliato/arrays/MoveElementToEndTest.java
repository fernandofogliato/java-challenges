package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MoveElementToEndTest {

    @Test
    public void case1() {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        int toMove = 2;
        assertThat(MoveElementToEnd.moveElementToEnd(array, toMove)).containsExactly(4, 1, 3, 2, 2, 2, 2, 2);
    }

    @Test
    public void case2() {
        List<Integer> array = Collections.emptyList();
        int toMove = 3;
        assertThat(MoveElementToEnd.moveElementToEnd(array, toMove)).isEmpty();
    }

    @Test
    public void case3() {
        List<Integer> array = Arrays.asList(1, 2, 4, 5, 6);
        int toMove = 3;
        assertThat(MoveElementToEnd.moveElementToEnd(array, toMove)).containsExactly(1, 2, 4, 5, 6);
    }
}