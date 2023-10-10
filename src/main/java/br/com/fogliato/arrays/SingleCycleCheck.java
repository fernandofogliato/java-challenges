package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/single-cycle-check
public class SingleCycleCheck {

    // Time O(n) where n is the length of the array
    // Space O(1)
    public static boolean hasSingleCycle(int[] array) {
        int currIdx = 0;
        int numElementsVisited = 0;
        while (numElementsVisited < array.length) {
            if (numElementsVisited > 0 && currIdx == 0) {
                return false;
            }
            int jump = array[currIdx];
            currIdx = (currIdx + jump) % array.length;
            if (currIdx < 0) {
                currIdx = currIdx + array.length;
            }
            numElementsVisited += 1;
        }

        return currIdx == 0;
    }
}
