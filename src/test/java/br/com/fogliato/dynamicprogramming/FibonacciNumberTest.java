package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciNumberTest {

    @Test
    void case1() {
        int n = 2;
        assertThat(new FibonacciNumber().fib(n)).isEqualTo(1);
    }

    @Test
    void case2() {
        int n = 3;
        assertThat(new FibonacciNumber().fib(n)).isEqualTo(2);
    }

    @Test
    void case4() {
        int n = 4;
        assertThat(new FibonacciNumber().fib(n)).isEqualTo(3);
    }
}