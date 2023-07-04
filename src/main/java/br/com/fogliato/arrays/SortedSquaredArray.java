package br.com.fogliato.arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int[] newArray = new int[array.length];
        int leftPointer = 0;
        int rightPointer = array.length-1;
        for (int i = array.length-1; i >= 0; i--) {
            int l = Math.abs(array[leftPointer]);
            int r = Math.abs(array[rightPointer]);
            if (l > r) {
                newArray[i] = l * l;
                leftPointer++;
            } else {
                newArray[i] = r * r;
                rightPointer--;
            }

        }
        return newArray;
    }
}
