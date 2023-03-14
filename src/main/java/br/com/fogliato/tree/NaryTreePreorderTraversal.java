package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal
public class NaryTreePreorderTraversal {

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> preorder(Node root) {
        if (root == null) {
            return result;
        }

        result.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                preorder(child);
            }
        }
        return result;
    }
}
