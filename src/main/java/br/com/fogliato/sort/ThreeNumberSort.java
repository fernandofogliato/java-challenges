package br.com.fogliato.sort;

// https://www.algoexpert.io/questions/three-number-sort
public class ThreeNumberSort {

    // Time O(n) | Space (1) where n is the length of the array.
    public static int[] threeNumberSort(int[] array, int[] order) {
        int firstValue = order[0];
        int secondValue = order[1];

        int firstIdx = 0, secondIdx = 0, thirdIdx = array.length-1;

        while (secondIdx <= thirdIdx) {
            int value = array[secondIdx];

            if (value == firstValue) {
                array[secondIdx] = array[firstIdx];
                array[firstIdx] = value;
                firstIdx++;
                secondIdx++;
            } else if (value == secondValue) {
                secondIdx++;
            } else {
                array[secondIdx] = array[thirdIdx];
                array[thirdIdx] = value;
                thirdIdx--;
            }

        }
        return array;
    }
}
