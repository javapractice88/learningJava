package com.javapractice.loops.forloop;

import java.util.Scanner;

public class HcfOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter First Number:");
        int num2 = sc.nextInt();

        int hcf = 1;
        int temp = (num1>num2) ? num1 : num2;

        for (int i=1; i<=temp; i++) {
            if(num1%i==0 && num2%i==0) {
                hcf = i;
            }
        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

}
