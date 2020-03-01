package br.com.fogliato.arrays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/2d-array
public class HourglassSum {

    static int hourglassSum(int[][] arr) {
        int biggerTotalHourGlass = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {

                int topLeft = arr[i-1][j-1];
                int top = arr[i-1][j];
                int topRight = arr[i-1][j+1];

                int center = arr[i][j];

                int buttomLeft = arr[i+1][j-1];
                int buttom = arr[i+1][j];
                int buttomRight = arr[i+1][j+1];

                int totalHourGlass = topLeft + top + topRight + center + buttomLeft + buttom + buttomRight;
                if (totalHourGlass > biggerTotalHourGlass) {
                    biggerTotalHourGlass = totalHourGlass;
                }
            }
        }

        return biggerTotalHourGlass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
        scanner.close();
    }
}
