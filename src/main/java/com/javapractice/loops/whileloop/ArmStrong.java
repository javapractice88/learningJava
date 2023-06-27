package com.javapractice.loops.whileloop;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter  digit");
        //int digit = sc.nextInt(); // 1234




        for (int i = 1; i<=500; i++){


            int sum = 0;

            int remainder;


            int temp = i;

       while(temp>0) {

            remainder = temp%10; //4

            sum  = sum + (remainder * remainder * remainder);

            temp/=10;


        }


        if (i== sum){

            System.out.println(i+ " ," );

        }

        }
}

}