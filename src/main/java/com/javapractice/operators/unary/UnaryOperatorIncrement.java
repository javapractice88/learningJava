package com.javapractice.operators.unary;

/**
 * The first pre-increment operator increases the value of i by 1 and outputs the new value of 1.
 * The next post-increment operator also increases the value of i by 1 but outputs the value of i as 1 before increment occurs.
 * After the post-increment, the output is displayed as 2.
 */
public class UnaryOperatorIncrement {

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i); // Output 0
        System.out.println(++i); // Output 1, first increment the value of i and then displays it as 1.

        System.out.println(i); // Output 1, displays the value of i because i is already incremented, i.e. 1 at right-hand side.
        System.out.println(i++); // Output 1, first displays the value of i as 1 and then increment it.
        System.out.println(i); // Output 2, displays the incremented value of i, i.e. 2.
    }
}
