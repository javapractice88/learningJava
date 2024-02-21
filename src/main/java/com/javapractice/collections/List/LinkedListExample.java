package com.javapractice.collections.List;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("rrr");
        ll.add(1, "fak");
        ll.add(2, "ggg");

        System.out.println(ll);
        ll.set(2, "fff");

        System.out.println(ll);


        Collections.sort(ll, Comparator.reverseOrder());
        System.out.println(ll);

    }


}
