package com.javapractice.loops.forloop.nestedforloops;

/**
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

public class Pattern {
    public static void main(String[] args) {
        //int k = 1;
        System.out.println("Displaying right triangle pattern of numbers: ");
// Outer for loop.
        for(int i = 1; i <= 5; i++)
        {
            // Inner for loop.
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
            //k++;
        }
    }
}
