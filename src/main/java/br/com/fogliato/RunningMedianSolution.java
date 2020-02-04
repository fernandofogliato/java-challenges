package br.com.fogliato;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedianSolution {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        scan.close();

        for (int number : numbers) {
            addNumber(number);
            System.out.println(getMedian());
        }

    }

    private static void addNumber(int number) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(number);
            return;
        }

        if (maxHeap.size() == minHeap.size()) {
            if (number < minHeap.peek()) {
                maxHeap.add(number);
            } else {
                minHeap.add(number);
                maxHeap.add(minHeap.remove());
            }
        } else {
            if (number > maxHeap.peek()) {
                minHeap.add(number);
            } else {
                maxHeap.add(number);
                minHeap.add(maxHeap.remove());
            }
        }
    }

    private static double getMedian() {
        if (maxHeap.isEmpty()) {
            return 0;
        } else if (maxHeap.size() == minHeap.size()) { // se pilhas tiverem o mesmo tamanho significa que é a mediana de um array par
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek(); // ímpar
        }
    }
}