package br.com.fogliato.miscellaneous;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int curr = 0;
        int prev = 0;
        for (int i = 1; i < queries.length; i++) {
            prev = prev + queries[i-1];
            curr = curr + prev;
        }
        return curr;
    }
}
