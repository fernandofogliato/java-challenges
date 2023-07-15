package br.com.fogliato.miscellaneous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

// https://www.algoexpert.io/questions/optimal-freelancing
public class OptimalFreeLancing {
    public int optimalFreelancing(Map<String, Integer>[] jobs) {
        Arrays.sort(jobs, Comparator.comparing((a) -> a.get("payment")));
        boolean[] schedule = new boolean[7];
        int profit = 0;

        for (int i = jobs.length-1; i >= 0; i--) {
            int payment = jobs[i].get("payment");
            int deadline = jobs[i].get("deadline") >= 7 ? 7 : jobs[i].get("deadline");

            // Find a empty slot in the schedule
            for (int j = deadline-1; j >= 0; j--) {
                if (!schedule[j]) {
                    schedule[j] = true;
                    profit += payment;
                    break;
                }
            }
        }
        return profit;
    }
}
