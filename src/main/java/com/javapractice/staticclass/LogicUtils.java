package com.javapractice.staticclass;

public class LogicUtils {

    public static boolean isPrime(int num) {
        for(int i=2;i<num;i++){
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return (num%2 == 0) ? true : false;
    }


}
