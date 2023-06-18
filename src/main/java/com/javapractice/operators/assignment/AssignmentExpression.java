package com.javapractice.operators.assignment;

public class AssignmentExpression {

    public static void main(String[] args) {
        int a = 19, b = 31, c = 50; // simple Assignment

        //Compound Assignments
        a += 1; // a = a + 1 = 19 + 1 =20
        b -= 1; // b = b - 1 = 31 - 1 = 30
        c *= 2; // c = c * 2 = 50 * 2 = 100

        //Assignment as Expression
        int x = (10 + a); // 10 + 20 = 30
        int y = x + 100; // 30 + 100 = 130
        int z = x + y + c; // 30 + 130 + 100 = 260

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
