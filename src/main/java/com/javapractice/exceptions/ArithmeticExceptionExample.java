package com.javapractice.exceptions;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        //int b = 3; Positive scenario
        int c = 0;
        try {
                c = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("ArithmeticException occurred here while dividing " + a + " with " + b);
        }
        System.out.println(c+5);
    }

    public int div (int a, int b) {
        int c = a/b;
        return c;
    }
}
