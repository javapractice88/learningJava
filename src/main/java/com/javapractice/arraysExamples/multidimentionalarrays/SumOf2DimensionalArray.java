package com.javapractice.arraysExamples.multidimentionalarrays;

public class SumOf2DimensionalArray {

    public static void main(String[] args) {

        int a[][] = {{23,65,34},
                     {43,76,98},
                     {54,76,23}};

        int sum =0;


        /**
         * a[0][0] = 23
         * a[0][1] = 65
         * a[0][2] = 34
         * a[1][0] = 43
         * a[1][1] = 76
         * a[1][2] = 98
         * a[2][0] = 54
         * a[2][1] = 76
         * a[2][2] = 23
         */

        for(int i=0; i<3;i++) {

            int rowSum = 0;

            for(int j=0; j<3;j++) {
                rowSum = rowSum + a[i][j];
                sum = sum + a[i][j];
            }

            System.out.println(rowSum);
        }
        System.out.println(sum);

    }
}
