package com.javapractice.loops.foreachloop;

public class PrimeNumber2 {

    public static void main(String[] args) {

        System.out.print("This are prime numbers: ");
        for (int i = 1; i <= 100; i++) {
            int primeNumber = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    primeNumber = 1;
                    break;
                }


            }
            if (primeNumber == 0) {

                System.out.print(+i + ",");
            }

        }
    }
}
