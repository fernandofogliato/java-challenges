package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidStartingCityTest {

    @Test
    public void case1() {
        int[] distances = new int[]{ 1, 3, 10, 6, 7, 7, 2, 4 };
        int[] fuel = new int[]{ 1, 1, 1, 1, 1, 1, 1, 1 };
        int mpg = 5;
        assertThat(ValidStartingCity.validStartingCity(distances, fuel, mpg)).isEqualTo(6);
    }
}