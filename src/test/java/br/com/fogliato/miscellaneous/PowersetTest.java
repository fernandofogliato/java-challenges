package br.com.fogliato.miscellaneous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PowersetTest {

    @Test
    public void case1() {
        List<Integer> test = Arrays.asList(1, 2, 3);
        Assertions.assertThat(Powerset.powerset(test)).contains(
            Collections.emptyList(), Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
            Arrays.asList(1,2), Arrays.asList(1, 3), Arrays.asList(2,3), Arrays.asList(1, 2, 3)
        );
    }
}