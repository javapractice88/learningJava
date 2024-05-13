package com.javapractice.exceptions;

public class NullPointerExample {

    public static void main(String[] args) {
        String str = null;
        //str.length();
        System.out.println("aaa".equalsIgnoreCase(str));
        System.out.println(str.equalsIgnoreCase("aaa"));
    }
}
