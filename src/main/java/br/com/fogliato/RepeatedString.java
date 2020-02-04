package br.com.fogliato;

import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/repeated-string
public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if (s.length() == 1) {
            return s.equals("a") ? n : 0;
        }

        long numberOfAsString = countNumberOfCharA(s, s.length());

        long repeatTimes = n /s.length();
        long totalCharsNewString = repeatTimes * s.length();
        long charsRemaining = n - totalCharsNewString;

        long totalA = countNumberOfCharA(s, charsRemaining);
        totalA += numberOfAsString * repeatTimes;
        return totalA;
    }

    private static long countNumberOfCharA(String s, long length) {
        int total = 0;
        for (int j = 0; j < length; j++) {
            if (s.charAt(j) == 'a') {
                total++;
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
        scanner.close();
    }
}
