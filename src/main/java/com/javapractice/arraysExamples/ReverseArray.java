package com.javapractice.arraysExamples;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {12, 32,45,11,22,98,80};

        int[] b = new int [a.length] ;

int j =0;

        for (int i = a.length-1; i>=0;i--){



            b[j] = a[i];

            j++;

        }

        for ( int k= 0; k<= b.length-1; k++){

            System.out.print(b[k] + ",");
        }
    }


}
