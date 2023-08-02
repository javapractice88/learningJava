package com.javapractice.arraysExamples.multidimentionalarrays;

public class SumOfArrayEachRow {
    public static void main(String[] args) {

        int a[][] = {{23, 65, 34},
                     {43, 76, 98},
                     {54, 76, 23}};

// a[00, 11, 22 i=j
        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 3; j++) {


                sum = sum + a[i][j];
            }
            System.out.println(+sum);
        }



    }
}