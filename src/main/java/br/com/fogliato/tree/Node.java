package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public Node(int _val, Node _child) {
        val = _val;
        children = new ArrayList<>();
        children.add(_child);
    }
}
