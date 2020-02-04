package br.com.fogliato;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    private static final int SEA_LEVEL = 0;

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int altitude = 0;
        int numberOfValleys = 0;
        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);
            if (step == 'U') {
                altitude++;
            } else {
                altitude--;
            }

            if (step == 'U' && altitude == SEA_LEVEL) {
                numberOfValleys++;
            }
        }

        return numberOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);
        scanner.close();
    }
}
