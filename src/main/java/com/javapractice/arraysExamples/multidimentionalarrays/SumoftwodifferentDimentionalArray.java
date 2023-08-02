package com.javapractice.arraysExamples.multidimentionalarrays;

public class SumoftwodifferentDimentionalArray {

    public static void main(String[] args) {

        int a[][] = {{23,65,34},
                     {43,76,98},
                     {54,76,23}};
        int b[][] = {{29,61,34},
                      {40,86,18},
                      {44,56,13}};
        int c[][] = new int[3][3];

        for(int i=0; i<3;i++) {

            for(int j=0; j<3;j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
