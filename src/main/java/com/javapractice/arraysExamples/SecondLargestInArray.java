package com.javapractice.arraysExamples;

import java.util.Arrays;

/**
 * Write a Java program to find the second largest element in an array.
 */
public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] array = {12, 23, 11, 22, 55, 64, 22};

        int max = array[0];
        int max2 = array[0];

        for (int i = 0; i <array.length; i++){
            if (array[i]>max){ // 12>12 = 12, 23>12 =23; 11>23 = 23; 22>23 =23; 55>23 = 55, 64>55= 64, 22>64=64
                max2=max;
                max = array[i];
            }
        }
        System.out.println("second largest num is: " +max2);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array) + array[1]);

    }
}
