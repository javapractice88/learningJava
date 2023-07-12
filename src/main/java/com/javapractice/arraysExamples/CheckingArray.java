package com.javapractice.arraysExamples;

/**
 *
 * Write a Java program to check if an array of integers is without 0 and -1
 */
public class CheckingArray {

    public static void main(String[] args) {
        int[] a = {2, 1, 0, 3,  4, 6};
        int j = 0;
        int k =0;
        for (int i = 0; i<a.length; i++){
            if (a[i]==0 ) {
                j = 1;
            }
            if (a[i]==-1 ){

                k = 1;
            }
      }
        System.out.println ((j==1 && k ==1)? "true" : "false");
        }
    }
