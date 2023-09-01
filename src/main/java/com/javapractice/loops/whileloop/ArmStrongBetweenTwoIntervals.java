package com.javapractice.loops.whileloop;

import java.util.Scanner;

public class ArmStrongBetweenTwoIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 2 intervals");
        int up = sc.nextInt();
        int down = sc.nextInt();

        int greater = up < down ? down : up;
        int smaller = up > down ? down : up;
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
            sum = sum + Math.pow(rem, noOfDigits);
            temp = temp / 10;
        }
        return sum;
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
