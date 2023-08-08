package com.javapractice.arraysExamples;

import java.util.Arrays;

/**
 * Write a Java program to compute the average value of an array of integers
 * except the largest and smallest values.
 */
public class AverageOfArray {

    public static void main(String[] args) {
        int[] a = {12, 23, 11, 22, 55, 64, 22};

        //one method
        Arrays.sort(a); //array return

        //method2
        for (int k = 0; k < a.length; k++) {
            System.out.print(+a[k] + "'");
        }

        double sum = 0.0;
        double average = 0.0;
        //method3
        for (int i = 1; i < a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum: " + sum);
        average = sum / (a.length - 2);

        System.out.println("Average of array: " + average);
    }
}
