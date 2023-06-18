package com.javapractice.operators.unary;

/**
 * As you can observe in this program, the post increment operator first stores the value in the left-side variable y
 * and then the operator increments the value of x by 1.
 */
public class PostIncrementOperator {

    public static void main(String[] args) {
        int x = 2;
        int y = x++;
        System.out.println("x = " +x+ ", " +"y = " +y);
    }
}
