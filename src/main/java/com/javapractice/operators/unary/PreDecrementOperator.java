package com.javapractice.operators.unary;

/**
 * Inside the program code, the first statement assigns the value 10 to x.
 * The second statement in the program performs two different actions:
 * Decrements x to 9.
 * Assigns a new decremented value to y.
 *
 */
public class PreDecrementOperator {

    public static void main(String[] args) {
        int x = 10;
        int y = --x;
        System.out.println("x is " +x+ ", y is "+y);

        int z = 10;
        int a = x--;
        int b = z--;
        System.out.println("z is " +z+ ", a is "+a + ", b is"+b);
    }
}
