package com.javapractice.arraysExamples;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {12, 32, 45, 11, 22, 98, 80, 90};

        int[] b = new int[a.length];

        b[0] = a[6];
        b[1] = a[5];
        b[2] = a[4];
        b[3] = a[3];
        b[4] = a[2];
        b[5] = a[1];
        b[6] = a[0];

        int j = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        System.out.println();
        // b[0],b[1],b[2],b[3].....
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.print(b[i] + ",");
        }
    }


}
