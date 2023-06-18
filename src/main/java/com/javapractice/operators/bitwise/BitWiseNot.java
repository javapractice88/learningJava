package com.javapractice.operators.bitwise;

public class BitWiseNot {

    public static void main(String[] args) {
        int a = 2, b = 10;
        System.out.println("(2 & 10): " +(a & b));
        System.out.println("(2 | 10): " +(a | b));
        System.out.println("(2 ^ 10): " +(a ^ b));
        System.out.println("~10: " +~b);
    }
}
