package br.com.fogliato.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/new-year-chaos
public class NewYearChaos {

        private final static int MAX_BRIBES_ALLOWED = 2;

        static String minimumBribes(int[] q) {
            int countBribes = 0;

            for (int i = q.length -1; i >= 0; i--) {
                int originalPlace = q[i];
                int currentPlace = i+1;

                if (originalPlace - currentPlace > MAX_BRIBES_ALLOWED) {
                    return "Too chaotic";
                }

                // Count how many times a person in position i received a bribe
                int firstPersonWhoCouldBribe = Math.max(0, originalPlace - MAX_BRIBES_ALLOWED);
                for (int j = firstPersonWhoCouldBribe; j < i; j++) {
                    if (q[j] > originalPlace) {
                        countBribes++;
                    }
                }
            }
            return String.valueOf(countBribes);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] q = new int[n];

                String[] qItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {
                    int qItem = Integer.parseInt(qItems[i]);
                    q[i] = qItem;
                }

                System.out.println(minimumBribes(q));
            }

            scanner.close();
        }
}
