package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LRUCacheTest {

    @Test
    public void case1() {
        var lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        assertThat(lruCache.get(1)).isEqualTo(1);    // return 1
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertThat(lruCache.get(2)).isEqualTo(-1); // returns -1 (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        assertThat(lruCache.get(1)).isEqualTo(-1);    // return -1 (not found)
        assertThat(lruCache.get(3)).isEqualTo(3);    // return 3
        assertThat(lruCache.get(4)).isEqualTo(4);    // return 4
    }

}