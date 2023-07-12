package br.com.fogliato.tree;

public class EvaluateExpressionTree {
    /*
    You're given a binary expression tree. Write a function to evaluate this tree mathematically and return a single resulting integer.
    All leaf nodes in the tree represent operands, which will always be positive integers. All of the other nodes represent operators.
    There are 4 operators supported, each of which is represented by a negative integer:
    -1: Addition operator, adding the left and right subtrees.
    -2: Subtraction operator, subtracting the right subtree from the left subtree
    -3: Division operator, dividing the left subtree by the right subtree. If the result is a decimal, it should be rounded towards zero.
    -4: Multiplication operator, multiplying the left and right subtrees.
     */
    public static int evaluateExpressionTree(BinaryTree tree) {
        if (tree.value >= 0) {
            return tree.value;
        }

        int leftValue = evaluateExpressionTree(tree.left);
        int rightValue = evaluateExpressionTree(tree.right);

        if (tree.value == -1) {
            return leftValue + rightValue;
        }
        if (tree.value == -2) {
            return leftValue - rightValue;
        }
        if (tree.value == -3) {
            return leftValue / rightValue;
        }
        return leftValue * rightValue;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
