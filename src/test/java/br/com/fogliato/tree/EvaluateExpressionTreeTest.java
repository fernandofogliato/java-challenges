package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvaluateExpressionTreeTest {

    @Test
    public void case1() {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-1);
        tree.left = new EvaluateExpressionTree.BinaryTree(-2);
        tree.right = new EvaluateExpressionTree.BinaryTree(-3);

        tree.left.left = new EvaluateExpressionTree.BinaryTree(-4);
        tree.left.right = new EvaluateExpressionTree.BinaryTree(2);

        tree.left.left.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.left.left.right = new EvaluateExpressionTree.BinaryTree(3);

        tree.right.left = new EvaluateExpressionTree.BinaryTree(8);
        tree.right.right = new EvaluateExpressionTree.BinaryTree(3);

        assertThat(EvaluateExpressionTree.evaluateExpressionTree(tree)).isEqualTo(6);
    }
}