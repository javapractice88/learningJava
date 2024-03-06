package com.javapractice.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLoopExample {

    public static void main(String[] args) {

        // 0,1,2,3,4
        Queue<Integer> que = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            que.add(i);
        }

        //Using Iterator
        System.out.println(que);
        Iterator it = que.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        Iterator it1 = que.iterator();
        while (it1.hasNext()) {
            sum = sum + Integer.parseInt(it1.next().toString());
        }
        System.out.println(sum);

        //Using ForEach loop.
        int forEachSum = 0;
        for (Integer index : que) {
            System.out.println(index);
            forEachSum = forEachSum + index;
        }

        System.out.println(forEachSum);

    }
}
