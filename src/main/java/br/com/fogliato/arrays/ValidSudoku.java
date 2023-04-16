package br.com.fogliato.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>(9);
        Map<Integer, Set<Character>> rows = new HashMap<>(9);
        Map<String, Set<Character>> squares = new HashMap<>(3);

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char value = board[r][c];
                if (value == '.') {
                    continue;
                }

                if (cols.containsKey(c) && cols.get(c).contains(value)) {
                    return false;
                }

                if (rows.containsKey(r) && rows.get(r).contains(value)) {
                    return false;
                }

                String key = (r/ 3) + "" + (c/3);
                if (squares.containsKey(key) && squares.get(key).contains(value)) {
                    return false;
                }

                if (!cols.containsKey(c)) {
                    cols.put(c, new HashSet<>(9));
                }

                if (!rows.containsKey(r)) {
                    rows.put(r, new HashSet<>(9));
                }

                if (!squares.containsKey(key)) {
                    squares.put(key, new HashSet<>(9));
                }

                cols.get(c).add(value);
                rows.get(r).add(value);
                squares.get(key).add(value);
            }
        }
        return true;
    }
}
