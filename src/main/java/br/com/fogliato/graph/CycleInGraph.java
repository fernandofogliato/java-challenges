package br.com.fogliato.graph;

import java.util.HashSet;
import java.util.Set;

// https://www.algoexpert.io/questions/cycle-in-graph
public class CycleInGraph {

    // O(e + v) time | O(v) space - where v is the number of vertices and e is the number of edges in the graph
    public static boolean cycleInGraph(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        Set<Integer> visitedInStack;

        for (int i = 0; i < edges.length; i++) {
            if (visited[i]) {
                continue;
            }
            visitedInStack = new HashSet<>();
            boolean hasCycle = checkCycle(i, edges, visited, visitedInStack);
            if (hasCycle) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkCycle(int node, int[][] edges, boolean[] visited, Set<Integer> visitedInStack) {
        visited[node] = true;
        visitedInStack.add(node);

        for (int neighbor : edges[node]) {
            if (visited[neighbor]) {
                if (visitedInStack.contains(neighbor)) {
                    return true;
                }
                continue;
            }

            if (checkCycle(neighbor, edges, visited, visitedInStack)) {
                return true;
            }
        }

        visitedInStack.remove(node);
        return false;
    }
}
