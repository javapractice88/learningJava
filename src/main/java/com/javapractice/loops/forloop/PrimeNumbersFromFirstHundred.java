package com.javapractice.loops.forloop;

/**
 * This class is used to print prime numbers from 1 to 100
 */
public class PrimeNumbersFromFirstHundred {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int primeNumber = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    primeNumber = 1;
                    break;
                }
            }
            if (primeNumber == 0) {
                System.out.println(i + ",");
            }
        }
    }
}
