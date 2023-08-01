package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayOfProductsTest {

    @Test
    public void case1() {
        int[] array = new int[]{5, 1, 4, 2};
        assertThat(ArrayOfProducts.arrayOfProducts(array)).containsExactly(8, 40, 10, 20);
    }

    @Test
    public void case2() {
        int[] array = new int[]{1, 8, 6, 2, 4};
        assertThat(ArrayOfProducts.arrayOfProducts(array)).containsExactly(384, 48, 64, 192, 96);
    }
}