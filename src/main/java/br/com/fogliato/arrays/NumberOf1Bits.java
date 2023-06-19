package br.com.fogliato.arrays;

// https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // adds 0 if last bit is 0 and adds 1 if last bit is 1
            n = n>>>1;  // Dropping the last bit of the binary number n
        }
        return count;
    }
}
