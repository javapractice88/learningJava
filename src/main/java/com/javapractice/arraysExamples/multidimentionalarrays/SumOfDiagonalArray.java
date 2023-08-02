package com.javapractice.arraysExamples.multidimentionalarrays;

public class SumOfDiagonalArray {
    public static void main(String[] args) {

        int a[][] = {{23, 65, 34},
                     {43, 76, 98},
                     {54, 76, 23}};

        int sum = 0;

        int sum1 = 0;
// a[00, 11, 22 i=j diagonal sum
        // a 02, 11, 20 reverse diagonal sum

        // a 10 20 21 diagonal left side sum
        //a 00 a10 20

        // 00 01 02

        for (int i = 0; i < 3; i++) {



            for (int j = 0; j < 3; j++) {
                if (i == j) {

                    sum = sum + a[i][j];

                }
            }

        }
        System.out.println("sum of diagonal: " +sum);


        for (int i = 0; i < 3; i++) {



            for (int j = 0; j < 3; j++) {
                if (i + j==2) {

                    sum1 = sum1+ a[i][j];

                }
            }

        }
        System.out.println("sum of  reverse diagonal: "+sum1);

          sum = 0;
        for (int i = 0; i < 3; i++) {



            for (int j = 0; j < 3; j++) {
                if (i < j) {

                    sum = sum + a[i][j];

                }
            }

        }

        System.out.println("sum of right diagonal: "+sum);

        sum = 0;
        for (int i = 0; i < 3; i++) {



            for (int j = 0; j < 3; j++) {
                if (i > j) {

                    sum = sum + a[i][j];

                }
            }

        }

        System.out.println("sum of  left diagonal: "+sum);

        sum = 0;
        for (int i = 0; i < 3; i++) {

            sum = sum + a[i][0];

                }

        System.out.println("sum of  first column: "+sum);

        sum = 0;
        for (int i = 0; i < 3; i++) {

            sum = sum + a[0][i];

        }

        System.out.println("sum of  first row: "+sum);
    }
}