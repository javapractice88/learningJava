package com.javapractice.loops.whileloop;

import java.util.Scanner;

public class ArmStrongBetweenTwoIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 2 intervals");
        int num1 = sc.nextInt(); //3
        int num2 = sc.nextInt(); //2





        int greater = (num1 > num2) ? num1 : num2;
        int smaller = (num1 < num2) ? num1 : num2;

        for (int i = smaller; i <= greater; i++) {
            double sum = 0;
            int temp = i;
            int noOfDigits = findNoOfDigitsInANumber(temp);

            sum = getArmStrongSum(sum, temp, noOfDigits);

            if (i == sum) {
                System.out.println(i);
            }
        }
    }

    private static double getArmStrongSum(double sum, int temp, int noOfDigits) {
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + Math.pow(rem, noOfDigits); // sum = sum + power(rem, noOfDigits)
            temp = temp / 10;
        }
        return sum;
    }

    public static double power(int rem, int numOfDigits) {
        double power = 1;
        for(int i=1; i<=numOfDigits;i++) {
            power = power * rem;
        }
        return power;
    }

    public static int findNoOfDigitsInANumber(int temp) {
        int noOfDigits = 0;
        while (temp > 0) {
            noOfDigits++;
            temp = temp / 10;
        }

        return noOfDigits;
    }
}
