package com.javapractice.collections.set;

import java.util.*;

/**
 *
 * HashSet implements Set Interface.
 * Hashset will not contain duplicates and the elements that are stored are not ordered
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("yyy");
        hs.add("xxyy");
        hs.add("hhh");
        hs.add("hhhddd");
        hs.add("ahhhd");
        hs.add("abhhd");

        System.out.println(hs);

        System.out.println("Printing using forEach method");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Sorting an hashset
        ArrayList<String> list = new ArrayList<>(hs);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Printing using forEach method");
        hs.forEach(s -> System.out.println(s));

        System.out.println("Printing using forEach loop");
        for (String s : hs) {
            System.out.println(s);
        }

    }
}
