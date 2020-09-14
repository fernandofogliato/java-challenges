package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CycleDetectTest {

    @Test
    void detectCycle_false() {
        CycleDetect.Node head = new CycleDetect.Node(1, null);
        boolean hasCycle = CycleDetect.hasCycle(head);
        assertThat(hasCycle).isFalse();
    }

    @Test
    void detectCycle_true() {
        CycleDetect.Node n5 = new CycleDetect.Node(5, null);
        CycleDetect.Node n4 = new CycleDetect.Node(4, n5);
        n5.next = n4;

        CycleDetect.Node n3 = new CycleDetect.Node(3, n4);
        CycleDetect.Node n2 = new CycleDetect.Node(2, n3);
        CycleDetect.Node n1 = new CycleDetect.Node(1, n2);
        boolean hasCycle = CycleDetect.hasCycle(n1);
        assertThat(hasCycle).isTrue();
    }
}