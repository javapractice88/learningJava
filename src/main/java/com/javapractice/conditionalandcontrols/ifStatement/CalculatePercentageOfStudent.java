package com.javapractice.conditionalandcontrols.ifStatement;

import java.util.Scanner;

public class CalculatePercentageOfStudent {

    int maths;
    int physics;
    int chemistry;

    void calculatePercentage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks for Maths Subject :- ");
        maths = sc.nextInt();

        System.out.println("Enter Marks for Physics Subject :- ");
        physics = sc.nextInt();

        System.out.println("Enter Marks for Chemistry Subject :- ");
        chemistry = sc.nextInt();

        float totalMarks = maths + physics + chemistry;

        float perct = totalMarks / 3;

        if (perct >= 85) {
            System.out.println("Student Secured Grade A");
        }

        if (perct < 85) {
            System.out.println("Student Not Secured Grade A");
        }
    }

    public static void main(String[] args) {
        CalculatePercentageOfStudent calculatePercentageOfStudent = new CalculatePercentageOfStudent();
        calculatePercentageOfStudent.calculatePercentage();
    }

}
