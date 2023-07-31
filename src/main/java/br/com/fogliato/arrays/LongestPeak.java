package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/longest-peak
public class LongestPeak {

    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;

        while (i < array.length-1) {
            int num1 = array[i-1];
            int num2 = array[i];
            int num3 = array[i+1];

            // Checks if is a peak
            boolean isPeak = num1 < num2 && num2 > num3;
            if (!isPeak) {
                i++;
                continue;
            }

            // Checks where the peak ends on the left side of the peak
            int leftIdx = i - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx+1]) {
                leftIdx--;
            }

            // Checks where the peak ends on the right side of the peak
            int rightIdx = i + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx-1]) {
                rightIdx++;
            }

            // The peak length is the difference between the leftIdx and rightIdx
            int currentPeakLength = rightIdx - leftIdx - 1;
            longestPeakLength = Math.max(longestPeakLength, currentPeakLength);

            // Skip the already seen values
            i = rightIdx;
        }
        return longestPeakLength;
    }
}
