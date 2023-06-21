package com.javapractice.loops.forloop.nestedforloops;

public class NestedForLoop {

    public static void main(String[] args) {
        // Outer for loop.
        for(int i = 1; i <= 3; i++)
        {
            System.out.print(i+ "\n"); // will execute 3 times.
            // Inner for loop.
            for(int j = 1; j <= 4; j++){
                System.out.print(j+ " "); // will execute 12 (3 * 4) times.
            }
            System.out.println(" ");
        }
    }
}
