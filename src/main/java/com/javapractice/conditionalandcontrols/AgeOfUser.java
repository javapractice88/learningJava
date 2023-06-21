package com.javapractice.conditionalandcontrols;

import java.util.Scanner;

public class AgeOfUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the your age");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Child");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }
    }
}
