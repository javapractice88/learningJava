package com.javapractice.loops.forloop;

import java.util.Scanner;

/**
 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 */
public class EvenOddSum {

    public static void main(String[] args) {



        Scanner integer = new Scanner(System.in);

        System.out.println("How many integers:");

        int noOfInt = integer.nextInt();

        int[] a = new int[noOfInt];

        int evenSum = 0;
        int oddSum = 0;

        for (int i =1; i<=noOfInt; i++ ){



            System.out.println("Please enter a num:");
            int mainNum = integer.nextInt();

            a[i-1] = mainNum;





            if( mainNum % 2 ==0){
                evenSum+= mainNum;
            }
            else {
                oddSum+= mainNum;
            }

        }

        System.out.println("The sum of even and odd numbers from below set of integers: { " );

        for (int s: a) {


            System.out.print(  +s+ " ," );
        }
        System.out.println(" }  Sum of even num: " +evenSum+ " Sum of odd num: " +oddSum);
    }
}
