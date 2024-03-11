package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/same-bsts
public class SameBsts {

    private SameBsts() {

    }

    // Time O(n²) | Space O(n²) - where n is the number of nodes in each array
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (arrayOne.size() != arrayTwo.size()) {
            return false;
        }

        if (arrayOne.isEmpty() && arrayTwo.isEmpty()) {
            return true;
        }

        int rootOne = arrayOne.get(0);
        int rootTwo = arrayTwo.get(0);
        if (rootOne != rootTwo) {
            return false;
        }

        List<Integer> leftNodesOne = getLeftNodes(rootOne, arrayOne);
        List<Integer> rightNodesOne = getRightNodes(rootOne, arrayOne);

        List<Integer> leftNodesTwo = getLeftNodes(rootTwo, arrayTwo);
        List<Integer> rightNodesTwo = getRightNodes(rootTwo, arrayTwo);

        return sameBsts(leftNodesOne, leftNodesTwo) && sameBsts(rightNodesOne, rightNodesTwo);
    }

    private static List<Integer> getLeftNodes(Integer root, List<Integer> array) {
        // Stats in 1 to skip the root node
        List<Integer> leftNodes = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < root) {
                leftNodes.add(array.get(i));
            }
        }
        return leftNodes;
    }

    private static List<Integer> getRightNodes(Integer root, List<Integer> array) {
        // Stats in 1 to skip the root node
        List<Integer> rightNodes = new ArrayList<>();
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) >= root) {
                rightNodes.add(array.get(i));
            }
        }
        return rightNodes;
    }
}
