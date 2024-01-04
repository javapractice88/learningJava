package com.javapractice.arraysExamples;

import java.util.Scanner;

public class MaximumNumberInAnArray {

    public static void main(String[] args) {
        //int array[] = {5,7,5,9,7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number are needed in an array");
        int index = sc.nextInt();
        int array[] = new int[index];

        for (int i=0; i<index;i++) {
            System.out.println("Enter " + i + " index value for an array");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i=1; i<array.length;i++) {
            if(max<array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum Number in an array is :" + max);
    }
}
