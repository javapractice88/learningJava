package com.javapractice.arraysExamples;

public class SecondMinimumNumber {
    public static void main(String[] args) {

        int[] a = {12, 23, 11, 22, 55, 64, 22};
        int min = a[0];
        int min1 = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min1 = min;
                min = a[i];
            }
        }
        System.out.println("second smallest num is: " + min1);
    }
}
