package com.javapractice.arraysExamples;

import com.javapractice.staticclass.LogicUtils;

public class CheckNumberInArrayArePrime {

    public static void main(String[] args) {
        int a[] = {23,4,6,8,9,11,17};
        for (int num: a) {
            System.out.println(LogicUtils.isPrime(num) ? num + " is prime Number" : num + " is not prime Number");
            System.out.println(LogicUtils.isEven(num) ? num + " is even Number" : num + " is odd Number");
        }
    }

}
