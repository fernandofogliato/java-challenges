package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TournamentWinnerTest {

    @Test
    public void case1() {
        List<List<String>> competitions = Arrays.asList(
                Arrays.asList("HTML", "C#"),
                Arrays.asList("C#", "Python"),
                Arrays.asList("Python", "HTML")
        );
        List<Integer> results = Arrays.asList(0, 0, 1);
        assertThat(new TournamentWinner().tournamentWinner(competitions, results)).isEqualTo("Python");
    }

    @Test
    public void case2() {
        List<List<String>> competitions = Arrays.asList(
                Arrays.asList("HTML", "Java"),
                Arrays.asList("Java", "Python"),
                Arrays.asList("Python", "HTML")
        );
        List<Integer> results = Arrays.asList(0, 1, 1);
        assertThat(new TournamentWinner().tournamentWinner(competitions, results)).isEqualTo("Java");
    }
}