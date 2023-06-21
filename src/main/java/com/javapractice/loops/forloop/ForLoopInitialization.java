package com.javapractice.loops.forloop;

public class ForLoopInitialization {

    public static void main(String[] args) {
        int i, j;
        for(i = 1, j = 5; i <= 5; i++, j--)
        {
            System.out.println(i+ "\t" +j);
        }
    }
}

    /**In this loop, we have used two initialization expressions (i = 1, and j = 5)
     * and two iteration expressions (i++, and j–). But there is only one test conditional expression (i < = 5).
     * This for loop will print i values from 1 to 5 whereas, the values of j will simultaneously change from 5 to 1.
     */



