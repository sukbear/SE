package com.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sukbear
 * @create 2018-12-16 14:22
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private int cacheSize;

    public LRUCache(int cacheSize) {
        super(16,0.75F, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>this.cacheSize;
    }
}
