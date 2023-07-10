package com.javapractice.arraysExamples;

/**
 * Write a Java program to find duplicate values in an array of integer values.
 */
public class FindDuplicateInAnArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 87, 34, 26, 10, 5, 54, 34};
        /**
         * index i=0; <=a.length-2;i++        checking index (j -> i+1; <=a.length-1;j++)
         * 0                                    1-a.length-1
         * 1                                    2-a.length-1
         * 2                                    3-a.length-1
         * 3                                    4-a.length-1
         * 4                                    5-a.length-1
         * 5                                    6-a.length-1
         * a.length-1
         */
        System.out.println("duplicate Numbers in an array a are :- ");

        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] == a[j]) { //for i=0 a[0] == a[1], a[0] == a[2], a[0] == a[3],a[0] == a[4] ....a[0] == a[9]
                    System.out.print("" + a[i] + ",");
                    break;
                }
            }
        }
    }
}
