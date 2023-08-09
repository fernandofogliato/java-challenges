package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/majority-element
public class MajorityElement {

    public static int majorityElement(int[] array) {
        int count = 0;
        int answer = 0;
        for (int num : array) {
            if (count == 0) {
                answer = num;
            }

            if (num == answer) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return answer;
    }
}
