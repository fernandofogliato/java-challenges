package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnionFindTest {

    @Test
    public void case1() {
        UnionFind unionFind = new UnionFind();
        unionFind.createSet(0);
        unionFind.createSet(2);
        unionFind.union(0, 2);
        unionFind.createSet(3);
        unionFind.createSet(1);
        unionFind.union(1, 3);

        assertThat(unionFind.find(0)).isEqualTo(0);
        assertThat(unionFind.find(1)).isEqualTo(1);
        assertThat(unionFind.find(2)).isEqualTo(0);
        assertThat(unionFind.find(3)).isEqualTo(1);

        unionFind.union(3, 0);
        assertThat(unionFind.find(0)).isEqualTo(1);
        assertThat(unionFind.find(1)).isEqualTo(1);
        assertThat(unionFind.find(2)).isEqualTo(1);
        assertThat(unionFind.find(3)).isEqualTo(1);
    }
}