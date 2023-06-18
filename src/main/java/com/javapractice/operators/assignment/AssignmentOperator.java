package com.javapractice.operators.assignment;

public class AssignmentOperator {

    public static void main(String[] args) {
        int x = 20;
        int y = 30, z = 50; //Simple assignment

        x += y; //Compound assignment // x = x + y = 20 + 30 = 50
        y -= x + z; // y = y - (x+z) // 30 - (50+50) = -70
        z *= x * y; // z = z * (x*Y) // 50 * (50*-70) = 50 * -3500 = -175000

        System.out.println("x = " +x );
        System.out.println("y = " +y );
        System.out.println("z = " +z );
    }
}
