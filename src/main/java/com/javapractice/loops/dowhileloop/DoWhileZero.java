package com.javapractice.loops.dowhileloop;

import java.util.Scanner;

public class DoWhileZero {

    public static void main(String[] args) {
        int num = 0, sum = 0;

        // Create an object of Scanner class to take input.
        Scanner sc = new Scanner(System.in);

        // Continue reading data until the input is 0.
        do {
            // Read the next input.
            System.out.println("Enter an integer number");
            num = sc.nextInt();
            sum = sum + num;
        } while(num != 0);
        System.out.println("Sum of numbers: " +sum);
    }
    }

