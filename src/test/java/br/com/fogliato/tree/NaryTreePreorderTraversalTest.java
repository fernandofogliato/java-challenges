package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NaryTreePreorderTraversalTest {

    // Input: root = [1,null,3,2,4,null,5,6]
    // Output: [1,3,5,6,2,4]
    @Test
    public void case1() {
        List<Node> children = new ArrayList<>();
        children.add(new Node(5));
        children.add(new Node(6));

        Node node3 = new Node(3, children);
        Node node2 = new Node(2, children);
        Node node4 = new Node(4, children);

        List<Node> childrenRoot = new ArrayList<>();
        childrenRoot.add(node3);
        childrenRoot.add(node2);
        childrenRoot.add(node4);
        Node root = new Node(1, childrenRoot);

        List<Integer> expectedOutput = Arrays.asList(1, 3, 5, 6, 2, 4);
        assertThat(NaryTreePreorderTraversal.preorder(root)).hasSameElementsAs(expectedOutput);
    }

    // Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    // Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
    @Test
    public void case2() {
        Node node2 = new Node(2);

        List<Node> childrenNode3 = new ArrayList<>();
        childrenNode3.add(new Node(6));
        childrenNode3.add(new Node(7,  new Node(11, new Node(14))));
        Node node3 = new Node(3, childrenNode3);

        Node node4 = new Node(4, new Node(8, new Node(12)));


        List<Node> childrenNode5 = new ArrayList<>();
        childrenNode5.add(new Node(9,  new Node(13)));
        childrenNode5.add(new Node(10));

        Node node5 = new Node(5, childrenNode5);

        List<Node> childrenRoot = new ArrayList<>();
        childrenRoot.add(node2);
        childrenRoot.add(node3);
        childrenRoot.add(node4);
        childrenRoot.add(node5);

        Node root = new Node(1, childrenRoot);

        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10);
        assertThat(NaryTreePreorderTraversal.preorder(root)).hasSameElementsAs(expectedOutput);
    }
}