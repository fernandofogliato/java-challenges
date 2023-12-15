package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TaskAssignmentTest {

    @Test
    public void case1() {
        int k = 3;
        List<Integer> tasks = Arrays.asList(1, 3, 5, 3, 1, 4);
        assertThat(TaskAssignment.taskAssignment(k, tasks))
                .containsExactly(Arrays.asList(4, 2), Arrays.asList(0, 5), Arrays.asList(3, 1));
    }
}