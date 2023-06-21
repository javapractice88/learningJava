package com.javapractice.loops.whileloop;

/**
 * Print the middle value between 2 numbers
 */
public class WhileLoopWithoutBody {

    public static void main(String[] args) {
        int x = 10, y = 20;
        while (++x < --y); // No body in this loop.
        /**
         * 10<19
         * 11<18
         * 12<17
         * 13<16
         * 14<15
         * 15<14
         */
        System.out.println("Mid value is " + x);


        }
        /**
         * 10<19
         * 11<18
         * 12<17
         * 13<16
         * 14<15
         * 15<14
         */

}
