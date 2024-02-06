package com.javapractice.collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        List<String> li = new LinkedList<>();

        al.add("xyz");
        al.add("abc");
        al.add("zzz");
        al.add(3, "lll");

        System.out.println(al);

        for (String a: al) {
            System.out.println(a);
        }

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
