package com.javapractice.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("YYYY");
        que.add("XXX");
        que.add("ZZZ");

        System.out.println(que.size());
        System.out.println(que);

        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.remove("ZZZ");
        System.out.println(que);
        System.out.println(que.size());

    }
}
