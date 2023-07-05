package com.javapractice.arraysExamples;

public class MaximumNum {

    public static void main(String[] args) {

        int[] array = {12,23, 11, 22,55,64,10};

        int max = array[0];

        for (int i = 0; i <array.length; i++){

            if (array[i]>max){ // 12>12 = 12, 23>12 =23; 23>11 = 23: 23>22 =23; 23>55 = 55,

                max = array[i];
            }
        }

        System.out.println("maximum num: " +max);
    }
}
