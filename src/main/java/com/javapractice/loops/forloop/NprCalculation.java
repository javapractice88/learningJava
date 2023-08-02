package com.javapractice.loops.forloop;

/**
 * NPR = n!/(n-r)! n= 8 r =2
 */
public class NprCalculation {
    public static void main(String[] args) {

        int factorial1 = 1;
        int factorial2 = 1;
        int npr;
        int n = 8;
        int r = 2;


        factorial1 = getFactorial(factorial1, n);
        int less = n-r;
        factorial2 = getFactorial(factorial2, less);
        npr = factorial1/factorial2;
        System.out.println(npr);
}

    private static int getFactorial(int factorial2, int less) {
        for (int i = 1; i<= less; i++){
            factorial2 = factorial2 * i;
    }
        return factorial2;
    }
}
