package com.javapractice.abstraction;

public class NonAbstract extends AbstractionExample1{

    private int r;

    public NonAbstract(int r) {
        this.r = r;
    }


    @Override
    public void testAbstract(int c) {
        int a = 5;
        System.out.println(c+a);
    }

    @Override
    public void abstractMethod() {
        System.out.println("This method is executed in NonAbstract Class");
    }

    @Override
    public double getArea() {
        return Math.PI * r *r;
    }

    public static void main(String[] args) {
        AbstractionExample1 ab = new NonAbstract(6);
        ab.abstractMethod();
        ab.test();
        ab.testAbstract(7);
        System.out.println(ab.str);
    }
}
