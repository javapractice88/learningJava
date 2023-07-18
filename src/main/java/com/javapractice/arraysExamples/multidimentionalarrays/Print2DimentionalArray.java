package com.javapractice.arraysExamples.multidimentionalarrays;

public class Print2DimentionalArray {

    public static void main(String[] args) {

        int a[][] = {{23,65,34},
                     {43,76,98},
                     {54,76,23}};

        /**
         * a[0][0] = 23
         * a[0][1] = 64
         * a[0][2] = 34
         * a[1][0] = 43
         * a[1][1] = 76
         * a[1][2] = 98
         * a[2][0] = 54
         * a[2][1] = 76
         * a[2][2] = 23
         */

        for(int i=0; i<3;i++) {
            for(int j=0; j<3;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
