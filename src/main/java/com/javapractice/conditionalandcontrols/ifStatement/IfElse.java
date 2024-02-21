package com.javapractice.conditionalandcontrols.ifStatement;

public class IfElse {
    public static void main(String[] args) {
        int a=6, b=4;
        int c;
        c = sum(a,b);
        System.out.println("Sum is : " + c);

        if (checkCIsGreaterThan20(c))
            System.out.println(c +" is less than 20");
         else
            System.out.println(c +" is greater than 20");
    }

    public static int sum(int x1, int x2) {
        return x1+x2;
    }

    public static boolean checkCIsGreaterThan20(int c) {
        return (c > 20);
    }
}
