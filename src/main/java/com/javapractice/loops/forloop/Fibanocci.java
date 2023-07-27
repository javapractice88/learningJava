package com.javapractice.loops.forloop;

import java.util.Scanner;

/**
 * Fibonacci series
 * 0 1 1 2 3 5 8 13 24 37  .....
 */
public class Fibanocci {

    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        System.out.print(f1 + "," + f2);


        for(int i=3;i<=10;i++) { //i=3,f1=0,f2=1,f3=1; i=4,f1=1,f2=1,f3=2; i=5, f1=2,f2=1,f3=3; i=6, f1=3,f2=2, f3=5
            int f3 = f1+f2;
            System.out.print("," + f3);
            f1=f2;
            f2=f3;
        }
    }
}
