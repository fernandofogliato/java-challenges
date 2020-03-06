package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSwapsTest {

    @Test
    void minimumSwaps_arrayWith4Positions_3Swaps() {
        int[] unorderedArray = new int[]{4, 3, 1, 2};
        int swaps = MinimumSwaps.minimumSwaps(unorderedArray);
        assertThat(swaps).isEqualTo(3);
    }

    @Test
    void minimumSwaps_arrayWith7Positions_5Swaps() {
        int[] unorderedArray = new int[]{7, 1, 3, 2, 4, 5, 6};
        int swaps = MinimumSwaps.minimumSwaps(unorderedArray);
        assertThat(swaps).isEqualTo(5);
    }
}
