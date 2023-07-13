package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class DepthFirstSearchTest {

    @Test
    public void case1() {
        DepthFirstSearch.Node root = new DepthFirstSearch.Node("A");

        // Children node B
        DepthFirstSearch.Node nodeB = new DepthFirstSearch.Node("B");
        DepthFirstSearch.Node nodeE = new DepthFirstSearch.Node("E");
        DepthFirstSearch.Node nodeF = new DepthFirstSearch.Node("F");
        nodeF.children.add(new DepthFirstSearch.Node("I"));
        nodeF.children.add(new DepthFirstSearch.Node("J"));
        nodeB.children.add(nodeE);
        nodeB.children.add(nodeF);

        DepthFirstSearch.Node nodeC = new DepthFirstSearch.Node("C");

        // Children node D
        DepthFirstSearch.Node nodeG = new DepthFirstSearch.Node("G");
        nodeG.children.add(new DepthFirstSearch.Node("K"));

        DepthFirstSearch.Node nodeD = new DepthFirstSearch.Node("D");
        nodeD.children.add(nodeG);
        nodeD.children.add(new DepthFirstSearch.Node("H"));

        // Children root
        root.children.add(nodeB);
        root.children.add(nodeC);
        root.children.add(nodeD);

        assertThat(root.depthFirstSearch(new ArrayList<>())).contains("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H");
    }
}