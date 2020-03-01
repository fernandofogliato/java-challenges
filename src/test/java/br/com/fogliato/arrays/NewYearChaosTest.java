package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewYearChaosTest {

    @Test
    void minimumBribes_arrayWith5Positions_4Bribes() {
        int[] queue = new int[]{2, 1, 5, 3, 4};
        String bribes = NewYearChaos.minimumBribes(queue);
        assertThat(bribes).isEqualTo("3");
    }

    @Test
    void minimumBribes_arrayWith5Positions_TooChaotic() {
        int[] queue = new int[]{2, 5, 1, 3, 4};
        String bribes = NewYearChaos.minimumBribes(queue);
        assertThat(bribes).isEqualTo("Too chaotic");
    }

    @Test
    void minimumBribes_arrayWith8Positions_TooChaotic() {
        int[] queue = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        String bribes = NewYearChaos.minimumBribes(queue);
        assertThat(bribes).isEqualTo("Too chaotic");
    }

    @Test
    void minimumBribes_arrayWith8Positions_7Bribes() {
        int[] queue = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        String bribes = NewYearChaos.minimumBribes(queue);
        assertThat(bribes).isEqualTo("7");
    }

    @Test
    void minimumBribes_arrayWith8Positions_4Bribes() {
        int[] queue = new int[]{1, 2, 5, 3, 4, 7, 8, 6};
        String bribes = NewYearChaos.minimumBribes(queue);
        assertThat(bribes).isEqualTo("4");
    }
}
