package com.javapractice.loops.whileloop;

public class WhileLoopWithoutBody {

    public static void main(String[] args) {
        int x = 10, y = 20;
        while (++x < --y); // No body in this loop.
        System.out.println("Mid value is " + x);
    }
}
