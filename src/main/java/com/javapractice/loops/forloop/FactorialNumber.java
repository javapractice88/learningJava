package com.javapractice.loops.forloop;

import java.util.Scanner;

/**
 * Factorial Of a number
 *
 * Example for factorial of 5 = 1*2*3*4*5 = 120
 */
public class FactorialNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial: ");
        int facNum = sc.nextInt();
        int factorial = 1;

        for(int i=1; i<=facNum; i++) {
            factorial = factorial * i; //if facNum = 5 then for loop will iterate like this1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120;
        }
        System.out.println("Factorial of Number " + facNum + " =" + factorial);


    }

}
