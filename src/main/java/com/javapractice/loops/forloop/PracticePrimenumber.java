package com.javapractice.loops.forloop;

import java.util.Scanner;

public class PracticePrimenumber {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num = a.nextInt();

        int temp = 0;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                System.out.print("This is not a prime number: " + num);

                temp = 1;

                break;
            }
        }
        if (temp == 0) {
            System.out.print("This is  a prime number: " + num);

        }
    }
}
