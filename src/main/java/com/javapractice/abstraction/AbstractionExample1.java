package com.javapractice.abstraction;

public abstract class AbstractionExample1 {

    String str = "abstract";

    public AbstractionExample1() {
    }

    public void test() {
        System.out.println("Non Abstract method");
    }
    public static int staticMethod(int c) {
        return c+5;
    }
    public abstract void testAbstract(int c);

    public abstract void abstractMethod();

    public abstract double getArea();

}
