package br.com.fogliato.sort;

public class BubbleSort {

    // O(n^2) time | O(1) space
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1-counter; i++) {
                int curr = array[i];
                int next = array[i+1];

                // Swap the elements
                if (curr > next) {
                    array[i] = next;
                    array[i+1] = curr;
                    isSorted = false;
                }
            }
            counter++; // Small optimization, since after the first loop the highest value is at the end
        }
        return array;
    }
}
