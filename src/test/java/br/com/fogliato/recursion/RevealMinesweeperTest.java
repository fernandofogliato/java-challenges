package br.com.fogliato.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RevealMinesweeperTest {

    @Test
    void case1() {
        String[][] board = {
                {"H", "H", "H", "H", "M"},
                {"H", "1", "M", "H", "1"},
                {"H", "H", "H", "H", "H"},
                {"H", "H", "H", "H", "H"}
        };
        int row = 3;
        int column = 4;
        board = RevealMinesweeper.revealMinesweeper(board, row, column);

        assertThat(board).containsExactly(new String[][]{
            { "0", "1", "H", "H", "M" },
            {"0", "1", "M", "2", "1" },
            {"0", "1", "1", "1", "0" },
            {"0", "0", "0", "0", "0" }
        });
    }
}