package com.javapractice.arraysExamples.multidimentionalarrays;

public class Print2DimentionalArray {

    public static void main(String[] args) {

        int a[][] = {{100,65,34},
                     {43,76,98},
                     {54,76,23}};

        int b[][] = {{43,54,100},
                {44,71,102},
                {60,105,29}};

        int c[][] = new int[3][5];

       /** int c[][] = {{66,119,134},
                    {87, 147, 200},
                    {114,181, 52}};**/

        /**
         * c[0][0] = a[0][0] + b[0][0]
         * c[0][1] = a[0][1] + b[0][1]
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

        /**
         * [00] [10] [20]
         */
        for(int i=0; i<3;i++) {
            int max = a[i][0]; //100
            for(int j=0; j<3;j++) {
                if(max < a[i][j]) { //23<65, max=65; 65<34, max=65; 65<43, max=65; 65<76, max=76; 76<98, max=98; 98<54, max=98;
                    max = a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
