package com.javapractice;

public class MethodOverloading {

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int c, int d, int e) {
        return add(c,d) + e;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        System.out.println(methodOverloading.add(4,5));

        System.out.println(methodOverloading.add(5,6,7));
    }
}
