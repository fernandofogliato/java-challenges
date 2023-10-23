package br.com.fogliato.graph;

import br.com.fogliato.graph.YoungestCommonAncestor.AncestralTree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class YoungestCommonAncestorTest {

    @Test
    public void case1() {
        AncestralTree b = new AncestralTree('B');
        AncestralTree c = new AncestralTree('C');
        AncestralTree d = new AncestralTree('D');
        AncestralTree e = new AncestralTree('E');
        AncestralTree f = new AncestralTree('F');
        AncestralTree g = new AncestralTree('G');
        AncestralTree h = new AncestralTree('H');
        AncestralTree i = new AncestralTree('I');

        AncestralTree topAncestor = new AncestralTree('A');
        topAncestor.addAsAncestor(new AncestralTree[]{ b, c });
        b.addAsAncestor(new AncestralTree[]{ d, e });
        d.addAsAncestor(new AncestralTree[]{ h, i });
        c.addAsAncestor(new AncestralTree[]{ f, g });

        AncestralTree commonAncestor = YoungestCommonAncestor.getYoungestCommonAncestor(topAncestor, e, i);
        assertThat(commonAncestor.name).isEqualTo('B');
    }
}