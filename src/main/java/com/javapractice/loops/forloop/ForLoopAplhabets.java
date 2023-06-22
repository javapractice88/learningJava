package com.javapractice.loops.forloop;

public class ForLoopAplhabets {

    public static void main(String[] args) {
        System.out.println("Displaying numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) { // Here, i++ is increment operator.
            System.out.println(i);
        }
        System.out.println("Displaying numbers from 5 to 1:");
        for (int j = 5; j > 0; j--) { // Here, j-- is decrement operator.
            System.out.println(j);
        }

        /*int i = 1;
        for(; i <= 5;) {
            System.out.println(i);
            i++;
        }*/
    }
}
