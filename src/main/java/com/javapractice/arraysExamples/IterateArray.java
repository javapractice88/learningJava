package com.javapractice.arraysExamples;

public class IterateArray {

    public static void main(String[] args) {

        int[] a = {2, 3, 4, 11, 44, 55};

        int[] b = new int[a.length];

        b[0] = a[0];
        b[1] = a[1];

        for ( int i = 0; i<a.length; i++){
           b[i] = a[i];
           //System.out.print(b[i]+",");
        }
        for ( int i = 0; i<b.length; i++){
            System.out.print(b[i]+",");
        }

    }
}
