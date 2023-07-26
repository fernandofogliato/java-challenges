package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.algoexpert.io/questions/three-number-sum
public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length-2; i++) {
            int value1 = array[i];
            int leftPointer = i+1;
            int rightPointer = array.length-1;

            while (leftPointer < rightPointer) {
                int value2 = array[leftPointer];
                int value3 = array[rightPointer];
                int sum = value1 + value2 + value3;

                if (sum == targetSum) {
                    result.add(new Integer[]{value1, value2, value3});
                    rightPointer--;
                    leftPointer++;
                } else if (sum > targetSum) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
        }
        return result;
    }
}
