package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subLevels = new ArrayList<>();
            for (int i = 0; i < level; i++){
                if (queue.peek() != null && queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek() != null && queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                subLevels.add(queue.remove().val);
            }
            result.add(subLevels);
        }
        return result;
    }
}
