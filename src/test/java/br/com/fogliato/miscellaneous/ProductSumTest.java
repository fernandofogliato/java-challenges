package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ProductSumTest {

    @Test
    public void case1() {
        List<Object> array = Arrays.asList(5, 2, Arrays.asList(7, -1), 3, Arrays.asList(6, Arrays.asList(-13, 8), 4));
        assertThat(ProductSum.productSum(array)).isEqualTo(12);
    }
}