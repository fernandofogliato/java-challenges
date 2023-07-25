package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/branch-sums
public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> totals = new ArrayList<>();
        branchSum(root, totals, 0);
        return totals;
    }

    private static void branchSum(BinaryTree node, List<Integer> totals, int sum) {
        if (node == null) {
            return;
        }
        sum += node.value;

        if (node.left == null && node.right == null) {
            totals.add(sum);
            return;
        }
        branchSum(node.left, totals, sum);
        branchSum(node.right, totals, sum);
    }
}
