package br.com.fogliato.graph;

import java.util.Stack;

// https://www.algoexpert.io/questions/two-colorable
public class TwoColorable {

    private static final int WHITE = 0;
    private static final int BLUE = 1;
    private static final int GREEN = 2;

    // O(v + e) time | O(v) space - where v is the number of vertices and e is the number of edges
    public static boolean twoColorable(int[][] edges) {
        int[] colors = new int[edges.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        colors[0] = BLUE;

        while (!stack.isEmpty()) {
            int edge = stack.pop();
            for (int neighbor: edges[edge]) {
                if (colors[neighbor] == WHITE) {
                    colors[neighbor] = colors[edge] == BLUE ? GREEN : BLUE; // opposite color
                    stack.add(neighbor);
                } else if (colors[neighbor] == colors[edge]) {
                    return false;
                }
            }
        }
        return true;
    }
}
