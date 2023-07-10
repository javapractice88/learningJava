package com.javapractice.arraysExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a Java program to remove a specific element from an array.
 */

public class RemoveIndexValueFromArray {
    public static void main(String[] args) {
        int[] a = {1,21,34,65,78,97,32,65};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value you want to remove in an array");
        int index = sc.nextInt(); //2
        for (int value: a) {
            System.out.print(value + ",");
        }
        for(int i=index; i<a.length-1; i++) {  //
            a[i] = a[i+1];
        }
        System.out.println();
        for(int i=0; i<a.length-1; i++) {  //
            System.out.print(a[i] + ",");
        }
    }
}
