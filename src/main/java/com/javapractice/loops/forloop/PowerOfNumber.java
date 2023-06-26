package com.javapractice.loops.forloop;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a main Number:");
        int num = sc.nextInt();

        System.out.println("Enter a power Number:");
        int power = sc.nextInt();
         int mainNum = 1;

         for(int i=1; i<=power;i++){

             mainNum = mainNum * num;// num =2 power =3, 1*2=2, 2*2 =4, 4*2 =8
         }

        System.out.println(num + " ^ " + power +  " = " +mainNum);
    }
}
