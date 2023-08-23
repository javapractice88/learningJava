package com.javapractice.loops;

import java.util.Scanner;
/**
 * Digit 2375
 *  * Sum Of Digits in a Number :- 2+3+7+5 = 17
 *  * countOfDigits Counts number of digits in a number
 */
public class SumOfDigitsInANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:" );
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int countOfDigits = 0;
        while (temp>0) {
            int rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
            countOfDigits= countOfDigits+1;
        }
        System.out.println("Sum Of digits in a Number" + num + " = " + sum);
        System.out.println("no Of digits in a Number" + num + " = " + countOfDigits);
    }
}
