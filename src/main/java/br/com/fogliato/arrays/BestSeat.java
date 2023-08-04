package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/best-seat
public class BestSeat {

    // O(n) time
    // O(1) space
    public static int bestSeat(int[] seats) {
        int idx = 1; // There is always someone setting in the first and last seat
        int longestZeros = 0;
        int contiguousZeros = 0;
        int bestSeat = -1;

        while (idx < seats.length) {
            int seat = seats[idx];
            int previousSeat = seats[idx-1];

            if (seat == 0) {
                if (previousSeat == 0) {
                    contiguousZeros++;
                } else {
                    contiguousZeros = 1;
                }
            }

            if (seat == 1 && contiguousZeros > longestZeros) {
                longestZeros = contiguousZeros;
                contiguousZeros = 0;
                bestSeat = idx - longestZeros/2 - 1;
            }
            idx++;
        }
        return bestSeat;
    }
}
