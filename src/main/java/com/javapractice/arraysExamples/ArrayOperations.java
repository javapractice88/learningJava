package com.javapractice.arraysExamples;


public class ArrayOperations {

    public static void main(String[] args) {

        int a[] = {10, 25, 47 ,53, 6};
        int[] b = new int[5];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a.length);

        int sum =0;

        double avg =1.0;

        for(int i=0; i < a.length; i++) {
            sum = sum + a[i];
            System.out.print(a[i] + ",");
        }
        System.out.print("sum" + sum);
        avg = sum/a.length;
        System.out.print("avg" + avg);
        System.out.println();
        a[0] = 30;
        System.out.println("Array Values after update");
        for (int value: a) {
            System.out.print(value + ",");
        }

        System.out.println();
        b[0] = 70;
        System.out.println("Add new value to an array");
        for (int value: b) {
            System.out.print(value + ",");
        }

    }
}
