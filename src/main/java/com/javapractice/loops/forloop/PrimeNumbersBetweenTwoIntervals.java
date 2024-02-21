package com.javapractice.loops.forloop;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int low = sc.nextInt();
        System.out.println("Enter second number: ");
        int high = sc.nextInt();

        for (int i = low; i < high; i++) {
            int temp = 0;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                System.out.print(+i + ",");
            }
        }
        System.out.println();
        while(low<high){
            int temp=0;
            int j =2;
            while(j<low){ //2<4 3<4 4<4
                if(low%j==0){
                    temp =1;
                }
                j++;
            }
            if(temp == 0){
                System.out.print(+low + ",");
            }
            low++;
        }
    }
}