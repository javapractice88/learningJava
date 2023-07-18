package com.javapractice.arraysExamples;

/**
 * Write a Java program to check if the sum of all the 10's in the array is exactly 30.
 * Return false if the condition does not satisfy, otherwise true.
 */
public class SumOfTens {

    public static void main(String[] args) {
        int[] a = {11, 10, 15, 20, 31, 72};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(+sum);
        if (sum == 30) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }
    }
}
