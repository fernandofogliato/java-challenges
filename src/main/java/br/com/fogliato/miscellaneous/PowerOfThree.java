package br.com.fogliato.miscellaneous;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
