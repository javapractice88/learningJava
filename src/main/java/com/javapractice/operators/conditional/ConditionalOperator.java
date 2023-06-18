package com.javapractice.operators.conditional;

/**
 * FInd the greatest number between X and Y
 */
public class ConditionalOperator {

    //Variable Declaration
    int x;
    int y;

    //constructor
    public ConditionalOperator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Method logic
    void greater() {
        int z = (x > y) ? x : y; // (30>40) ? 30 : 40;
        System.out.println("Greatest number: " +z);
    }

    //Method logic
    void smallest() {
        int z = (x < y) ? x : y; // (30>40) ? 30 : 40;
        System.out.println("Smallest number: " +z);
    }

    //Equal logic
    void Equal() {
        String z = (x == y) ? "X is qual to Y" : "X is not equal to y"; // (30>40) ? 30 : 40;
        System.out.println(z);
    }

    //Main Execution
    public static void main(String[] args) {
        ConditionalOperator conditionalOperator = new ConditionalOperator(30, 40);
        conditionalOperator.greater();
        conditionalOperator.smallest();
        conditionalOperator.Equal();
    }
}
