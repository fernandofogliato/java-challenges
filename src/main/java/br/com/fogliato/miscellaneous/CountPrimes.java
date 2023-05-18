package br.com.fogliato.miscellaneous;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
public class CountPrimes {

    // Sieve of Eratosthenes
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean isPrime[] = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
