package com.javapractice.arraysExamples;

import java.util.Scanner;

public class IndexArray {

    public static void main(String[] args) {
        int[] a = {20, 30, 10, 22, 33, 45};

        int a1 = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println(i + ".");
                break;
            }
        }
    }
}
