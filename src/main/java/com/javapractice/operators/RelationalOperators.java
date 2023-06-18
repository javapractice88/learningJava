package com.javapractice.operators;

public class RelationalOperators {

    //Variable Initialization
    int x = 30;
    float y = 50.5f;
    int z = 60;


    //Constructor
    public RelationalOperators(int x, float y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    RelationalOperators() {
    }

    void compare() {
        if (y > x) {
            System.out.println("y is less than x");
        } else if (y == x) {
            System.out.println("y is equal to x");
        } else if (y == x) {
            System.out.println("y is equal to x");
        } else if (y == x) {
            System.out.println("y is equal to x");
        } else {
            System.out.println("Y is less than x");
        }

        //New If condition
        if (x > z) {
            System.out.println("x is greater than z");
        } else if (x >= z) {
            System.out.println("x is greater than or equal to z");
        } else if (x != z) {
            System.out.println("x is not equal to z");
        }


        // New If Condition
        if (x == z) {
            System.out.println("y is less than z");
            y++;
        } else{
            System.out.println("y is greater than z");
        }



    }


    public static void main(String[] args) {
        // Create an object of class.
        RelationalOperators t = new RelationalOperators(30, 50.5f, 60);
        t.compare(); // Calling compare method using reference variable t.

        RelationalOperators t1 = new RelationalOperators();
        t1.compare();
    }
}
