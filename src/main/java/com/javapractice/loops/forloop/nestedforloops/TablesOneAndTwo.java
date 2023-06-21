package com.javapractice.loops.forloop.nestedforloops;

public class TablesOneAndTwo {

    public static void main(String[] args) {
        System.out.println("Displaying Tables: ");
        // Outer for loop.
        for(int i = 1; i <= 3; i++)
        {
            // Inner for loop.
            for(int j = 1; j <= 10; j++){
                System.out.println(i+ " * " +j+" = "+ (i*j));
            }
            System.out.println(" ");
        }
    }
}
