package com.javapractice.arraysExamples;

public class MaximumNum {

    public static void main(String[] args) {

        int[] array = {12, 23, 11, 22, 55, 64, 22};

        int max = array[0];
        int min = array[0];
        int max2 = array[0];
        int max3 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { // 12>12 = 12, 23>12 =23; 11>23 = 23; 22>23 =23; 55>23 = 55, 64>55= 64, 22>64=64
                max3 = max2;
                max2 = max;
                max = array[i];
            }

            if (min > array[i]) { // 12>12 = 12, 12>23 =12; 12>11 = 11: 12>22 =11; 12>10 = 10,
                min = array[i];
            }
        }
        System.out.println("maximum num is: " + max3 + " minimum Number is : " + min);
    }
}
