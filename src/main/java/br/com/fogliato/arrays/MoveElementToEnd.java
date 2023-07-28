package br.com.fogliato.arrays;

import java.util.List;

// https://www.algoexpert.io/questions/move-element-to-end
public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int leftPointer = 0;
        int rightPointer = array.size()-1;
        while (leftPointer < rightPointer) {
            int val1 = array.get(leftPointer);
            int val2 = array.get(rightPointer);

            if (val1 != toMove) {
                leftPointer++;
                continue;
            }

            if (val1 == val2) {
                rightPointer--;
                continue;
            }

            array.set(leftPointer, val2);
            array.set(rightPointer, val1);
            leftPointer++;
            rightPointer--;
        }
        return array;
    }
}
