package com.javapractice.operators.unary;

/**
 * The first statement in the code assigns a value 2 to x. The second statement in the code performs two different actions:
 *
 * Increments x to 3.
 * Assigns the new incremented value 3 to y.
 */
public class PreIncrementUnary {

    public static void main(String[] args) {
        int x = 2;
        int y = ++x;
        System.out.println("x = " +x+ ", " +"y = " +y);
    }
}


