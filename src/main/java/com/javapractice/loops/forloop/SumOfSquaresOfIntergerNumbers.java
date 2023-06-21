package com.javapractice.loops.forloop;

public class SumOfSquaresOfIntergerNumbers {

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++) {
            sum = sum + (i*i);
        }
        System.out.println("Sum: "+ sum);
    }
}
