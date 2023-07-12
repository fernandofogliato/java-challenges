package br.com.fogliato.tree;

import java.util.Stack;

public class NodeDepths {

    // The distance between a node in a Binary Tree and the tree's root is called the node's depth.
    // Write a function that takes in a Binary Tree and returns the sum of its node's depths.
    // Each Binary Tree node has an integer value, a left value child node, and a right node.
    // Children nodes can either be BinaryTree nodes themselves or None/null
    public static int nodeDepths(BinaryTree root) {
        Stack<NodeInfo> stack = new Stack<>();
        int sumOfDepths = 0;

        stack.push(new NodeInfo(root, 0));

        while (!stack.isEmpty()) {
            NodeInfo nodeInfo = stack.pop();
            if (nodeInfo.node == null) {
                continue;
            }
            sumOfDepths += nodeInfo.depth;
            stack.push(new NodeInfo(nodeInfo.node.left, nodeInfo.depth + 1));
            stack.push(new NodeInfo(nodeInfo.node.right, nodeInfo.depth + 1));
        }
        return sumOfDepths;
    }

    /*
    public static int nodeDepths(BinaryTree root) {
        return sumNodes(root, 0);
    }
     */
    private static int sumNodesUsingRecursion(BinaryTree node, int depth) {
        if (node == null) {
            return 0;
        }
        return depth + sumNodesUsingRecursion(node.left, depth+1) + sumNodesUsingRecursion(node.right, depth+1);
    }

    static class NodeInfo {
        BinaryTree node;
        int depth;

        public NodeInfo(BinaryTree node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
