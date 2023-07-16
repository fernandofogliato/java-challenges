package br.com.fogliato.sort;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
