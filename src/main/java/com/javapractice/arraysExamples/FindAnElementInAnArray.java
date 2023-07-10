package com.javapractice.arraysExamples;

import java.util.Scanner;

public class FindAnElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,5,87,34,26,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to find in an array");
        int value = sc.nextInt(); //5
        int temp = 0;
        for(int i=0; i< arr.length; i++) {
            if(value == arr[i]) {
                temp = 1;
                break;
            }
        }
        if(temp == 0) {
            System.out.println(value + " is not present in an array");
        } else {
            System.out.println(value + " is present in an array");
        }
    }
}
