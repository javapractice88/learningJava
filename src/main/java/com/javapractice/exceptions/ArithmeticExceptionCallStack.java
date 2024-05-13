package com.javapractice.exceptions;

public class ArithmeticExceptionCallStack {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            computeDivision(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0 ::");
            e.printStackTrace();
        }

    }

    private static void computeDivision(int a, int b) {
        try {
            String d = "abc";
            System.out.println(Integer.parseInt(d));
            dividedBy0(a, b);
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception Occurred");
            e.printStackTrace();
        }

    }

    private static int dividedBy0(int a, int b) {
        return a / b;
    }
}
