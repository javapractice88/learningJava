package com.javapractice.loops.dowhileloop;

import java.util.Scanner;

public class doWhileNumAndSum {

    public static void main(String[] args) {
        //int sum = 0;
        int mul = 1;
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a Number :");
            num = sc.nextInt(); //5, 10, 2, 1
            //sum = sum + num;
            mul = mul * num;  // 1*5 = 5, 5*10 = 50, 50*2 = 100
        } while(num != 1);

        //System.out.println("Sum of entered numbers = " + sum);
        System.out.println("Sum of entered numbers = " + mul);
    }
}
