package com.javapractice.loops.forloop;

import java.util.Scanner;

public class numberReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that needs to be reversed");

        int input = sc.nextInt(); //12345

        int temp = input; // temp = 12345;4567
        int remainder;
        int reverse = 0;

        while (temp>0) {
            remainder = temp % 10; //12345%10 = 5; 1234%10= 4 ; 123%10=3; 12%10 =2; 1%10 = 1
            reverse = reverse * 10 + remainder; // 0*10 + 5 = 5; 5*10+4 = 54; 54*10+3= 543; 543*10+2 = 5432; 5432*10+1 = 54321
            temp /=10; // temp = 1234; 123; 12; 1; 0
        }
        System.out.println("Reverse of number " + input + " is: " + reverse );
    }
}
