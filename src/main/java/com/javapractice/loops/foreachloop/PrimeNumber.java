package com.javapractice.loops.foreachloop;

import java.util.Scanner;

/**
 * Write a program that prompts the user to input a positive integer.
 * It should then output a message indicating whether the number is a prime number.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a num: ");

        int primeNum = sc.nextInt();

        int p = 0;// temp variable

        for (int i = 2; i <= primeNum - 1; i++) {// 7

            if (primeNum % i == 0) {// 7%2, 7%3, 7%4,7%5,7%6

                p = 1;

                break;

            }


        }
        if (p == 0) {

            System.out.println("It's a prime num: " + primeNum);
        } else {

            System.out.println("It's not a prime num: " + primeNum);
        }


    }
}
