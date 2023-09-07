package com.javapractice.conditionalandcontrols;

import java.util.Scanner;

public class SwitchCaseCalculator {

    public static void main(String[] args) {
        char operator;
        double num1, num2, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator (+,*,-,/,%) and 2 numbers for doing calculation");
        operator = sc.next().charAt(0);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println(operator);
        System.out.println(num1);
        System.out.println(num2);

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                result = 0;
        }

        System.out.println("Result :" + result);

        if (operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if(operator == '*') {
            result = num1 * num2;
        } else if(operator == '/') {
            result = num1 / num2;
        } else if(operator == '%') {
            result = num1 % num2;
        } else {
            result = 0;
        }

        System.out.println("Result for if else :" + result);

    }
}
