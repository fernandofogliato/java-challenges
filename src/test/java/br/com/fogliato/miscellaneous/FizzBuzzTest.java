package br.com.fogliato.miscellaneous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FizzBuzzTest {

    @Test
    public void case1() {
        int n = 3;
        List<String> expectedOutput = Arrays.asList("1", "2", "Fizz");
        Assertions.assertThat(new FizzBuzz().fizzBuzz(n)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case2() {
        int n = 5;
        List<String> expectedOutput = Arrays.asList("1","2","Fizz","4","Buzz");
        Assertions.assertThat(new FizzBuzz().fizzBuzz(n)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case3() {
        int n = 15;
        List<String> expectedOutput = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        Assertions.assertThat(new FizzBuzz().fizzBuzz(n)).hasSameElementsAs(expectedOutput);
    }
}