package br.com.fogliato.arrays;

import java.util.List;

public class ValidSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < array.size() && pointer2 < sequence.size()) {
            int s = sequence.get(pointer2);
            int n = array.get(pointer1);
            if (s == n) {
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == sequence.size();
    }
}
