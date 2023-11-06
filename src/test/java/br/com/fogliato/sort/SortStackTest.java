package br.com.fogliato.sort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortStackTest {

    @Test
    public void case1() {
        List<Integer> stack = new ArrayList<>(Arrays.asList(-5, 2, -2, 4, 3, 1));
        SortStack.sortStack(stack);
        assertThat(stack).containsExactly(-5, -2, 1, 2, 3, 4);
    }
}