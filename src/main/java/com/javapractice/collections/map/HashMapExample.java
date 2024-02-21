package com.javapractice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("abc", 123);
        hm.put("zzz", 345);
        hm.put("xxx", 564);

        for(Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " ::: " + e.getValue());
        }
    }
}
