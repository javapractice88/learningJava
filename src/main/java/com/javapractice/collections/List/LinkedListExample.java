package com.javapractice.collections.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("rrr");
        ll.add(1, "eee");
        ll.set(2, "fff");

        System.out.println(ll);
    }


}
