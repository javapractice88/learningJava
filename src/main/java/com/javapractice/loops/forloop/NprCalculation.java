package com.javapractice.loops.forloop;

/**
 * NPR = n!/(n-r)! n= 8 r =2
 */
public class NprCalculation {

    public static void main(String[] args) {

        int npr;
        int n = 8;
        int r = 2;
        int factorial1 = getFactorial(n);
        int less = n - r;
        int factorial2 = getFactorial(less);
        int factorial3 = getFactorial(r);
        npr = factorial1 / factorial2;
        int ncr = factorial1 / (factorial2 * factorial3);
        System.out.println(npr);
        System.out.println(ncr);
    }

    public static int getFactorial(int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
