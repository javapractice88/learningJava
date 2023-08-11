package com.javapractice.arraysExamples;

/**
 * write a program to find common elements in 2 array
 */
public class DuplicateElementsInTwoArrays {

    public static void main(String[] args) {

        int[] a = {12, 32, 45, 11, 22, 98, 80, 90};
        int[] a2 = {14, 31, 32, 43, 12, 78, 90, 9};

        /**
         *r
         * i=0;<a.lemgth;++      j=;0;<a2.length();++
         * a[0]                  a2[0 - length-1]
         * a[1]                 a2[0 - length-1]
         * a[2]                 a2[0 - length-1]
         */
        System.out.println("Common numbers in two array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a[i] == a2[j]) {
                    System.out.print(a[i] + ",");
                    break;
                }
            }
        }

    }
}
