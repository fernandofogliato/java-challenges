package br.com.fogliato;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numberOfStepsRequired = 0;
        int continuousClouds = 0;

        for (int i = 0; i < c.length; i++) {
            int cloud = c[i];
            if (cloud == 1) {
                numberOfStepsRequired++;
                continuousClouds = 0;
                continue;
            }
            continuousClouds++;

            if (continuousClouds == 2) {
                numberOfStepsRequired++;
                continuousClouds = 0;
            }
        }
        return numberOfStepsRequired;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
        scanner.close();
    }
}
