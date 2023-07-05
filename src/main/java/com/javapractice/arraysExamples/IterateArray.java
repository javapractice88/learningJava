package com.javapractice.arraysExamples;

public class IterateArray {

    public static void main(String[] args) {

        int[] a = {2, 3, 4, 11, 44, 55};

        int[] b = new int[a.length];

        for ( int i = 0; i<a.length; i++){

           b[i] = a[i];

           System.out.print(b[i]+",");
        }


    }
}
