package com.company;
import java.util.*;
import java.util.concurrent.*;
public class LRUCache {
    private int capacity;
    private ConcurrentHashMap<Integer, Integer> cache;
    private LinkedList<Integer> orderList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new ConcurrentHashMap<>(capacity);
        this.orderList = new LinkedList<>();
    }

    public int get(int key) {
        if (this.cache.get(key) != null) {
            this.updateListOrder(key);
            return this.cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (this.cache.get(key) == null) {
            this.cache.put(key, value);
            this.orderList.add(key);
             evict();
             return;
        }
        //update the cache
        //if the  value is not the same}
        else if (this.cache.get(key) != value){
            this.cache.put(key, value);
            this.updateListOrder(key);
        }
    }

    private void updateListOrder (int key) {
        if (this.cache.get(key) != null) {
            this.orderList.removeFirstOccurrence(key);
            this.orderList.add(key);
        }
    }


    private void evict(){
        if (this.cache.size() > this.capacity) {
            int oldKey = this.orderList.getFirst();
            this.cache.remove(oldKey);
            this.orderList.removeFirst();
        }

    }

}
