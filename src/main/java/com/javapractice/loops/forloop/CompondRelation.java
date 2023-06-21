package com.javapractice.loops.forloop;

public class CompondRelation {

    public static void main(String[] args) {
        int x = 1, sum = 0;
        for(x = 1; x < 20 && sum < 20; x++){
            sum = sum + x;
        }
        System.out.println("Sum: " +sum);
    }
}

/**
 * In this example, the loop will be executed until both conditions x < 20 and sum < 20 are true. The sum is evaluated within the body of loop.
 */