package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {

    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("abc");
        als.add("bsc");
        als.add("sdsd");

        //Using Collections sort
        Collections.sort(als);
        System.out.println(als);
        als.sort((o1, o2) -> {
            System.out.println(o1.equalsIgnoreCase(o2));
            System.out.println(o1);
            System.out.println(o2);
            return 1;
        });

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(5);
        ali.add(2);
        ali.add(1);

        ali.sort(Comparator.naturalOrder());
        System.out.println(ali);

        ali.sort(Comparator.reverseOrder());
        System.out.println(ali);
    }


}
