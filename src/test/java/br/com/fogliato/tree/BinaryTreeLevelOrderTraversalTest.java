package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void case1() {
        TreeNode node20 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), node20);

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(3));
        expectedOutput.add(Arrays.asList(9, 20));
        expectedOutput.add(Arrays.asList(15, 7));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(1));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case3() {
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(null)).isEmpty();
    }

    @Test
    public void case4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(1));
        expectedOutput.add(Arrays.asList(2));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case5() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(1));
        expectedOutput.add(Arrays.asList(2, 3));
        expectedOutput.add(Arrays.asList(4, 5));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case6() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(1));
        expectedOutput.add(Arrays.asList(2, 3));
        expectedOutput.add(Arrays.asList(4, 5));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }

    @Test
    public void case7() {
        TreeNode node2 = new TreeNode(2, new TreeNode(1, new TreeNode(5), new TreeNode(1)), null);
        TreeNode node4 = new TreeNode(4, new TreeNode(3, new TreeNode(6), null), new TreeNode(-1, null, new TreeNode(8)));
        TreeNode root = new TreeNode(0, node2, node4);

        List<List<Integer>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(0));
        expectedOutput.add(Arrays.asList(2, 4));
        expectedOutput.add(Arrays.asList(1, 3, -1));
        expectedOutput.add(Arrays.asList(5, 1, 6, 8));
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).hasSameElementsAs(expectedOutput);
    }
}