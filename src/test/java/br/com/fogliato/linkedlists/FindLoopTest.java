package br.com.fogliato.linkedlists;

import br.com.fogliato.linkedlists.FindLoop.LinkedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLoopTest {

    @Test
    void case1() {
        LinkedList startLoop = new LinkedList(4);
        LinkedList head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(3);
        head.next.next.next.next = startLoop;
        head.next.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next.next = new LinkedList(8);
        head.next.next.next.next.next.next.next.next.next = new LinkedList(9);
        head.next.next.next.next.next.next.next.next.next.next = startLoop;

        Assertions.assertThat(FindLoop.findLoop(head)).isEqualTo(startLoop);
    }
}