package com.company;

import com.google.gson.Gson;

import java.util.*;

public class PackNumbers {
    static Gson gson = new Gson();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();
        list.add(2);
        list.add((2));
        list.add(1);
        list.add(5);
        list.add(5);
        list.add((7));
        list.add(7);
        list.add((5));

        LinkedHashSet<Integer> hSet = new LinkedHashSet<>(list);
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int x : list) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (Integer numSet : hSet) {
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (!numSet.equals(entry.getKey())) {
                    continue;
                }
                if (entry.getValue() == 1) {
                    sortedList.add(entry.getKey().toString());
                } else {
                    sortedList.add(entry.getKey() + ":" + entry.getValue());
                }


            }
        }
        System.out.println(gson.toJson(sortedList));
    }
    class DataEntry {
        Integer index;
        Integer key;
        Integer value;

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

}
