package com.javapractice.collections.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<String> ve = new Vector<>();

        //Vector
        ve.add("hhhh");
        ve.add("jjjj");
        ve.add("oooo");
        ve.add("uuuu");


        System.out.println(ve);

        for (String a: ve) {
            System.out.println(a);
        }

        Iterator<String> it = ve.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
