package com.javapractice.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(5);
        ss.add(3);
        ss.add(5);
        ss.add(1);
        ss.add(6);

        System.out.println(ss);
        System.out.println(ss.last());

        Iterator it = ss.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(5);
        ts.add(1);
        ts.add(6);
        Iterator it1 = ts.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
