package com.javapractice.arraysExamples;

public class SumOfTwoArrays {

    public static void main(String[] args) {

        int[] a = {12, 23, 45, 65, 77};
        int[] b = {80, 3, 45, 22, 21};
        int[] c = new int[5];

        /*
        c[0 = a[0 + b[0

       c[1 = a[1 + b[1
         */

        System.out.print("sum of two arrays: [ ");
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.print(c[i] + " ]");
            } else {
                System.out.print(c[i] + ",");
            }
        }

    }
}
