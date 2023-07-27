package com.javapractice.loops.forloop;

import java.util.Scanner;

/**
 * use scanner x=5
 * n=10
 *
 * sum=0;
 * 5+(5*5*5)/(1*2*3) + (5*5*5*5*5)/(1*2*3*4*5) + 57/7! + 59/9!
 *
 *
 * for(int i=1;i<=n;i++) {
 *   int power = 1;
 *   int fact = 1;
 *   if(i%2 != 0) {
 * 	for(int j=1; j<=i;j++) {
 * 	   power = power*x; 1*5=5; 5*5=25; 25*5=125
 * 	   fact = fact*j; 1*1=1;1*2=2;2*3=6
 *        }
 * 	if() {
 *
 *    } else {
 * 		sum = sum + (power/fact);
 *    }
 *   }
 *
 * }
 */

/*
sin x = x - x3/3! + x5/5! - x7/7! + x9/9! - ...

x=4 and n=8 both are always positive integers

sin 4 = 4^1/1! - 4^3/3! + 4^5/5! - 4^7/7!
      = 4/1 - (4*4*4)/(1*2*3) + (4*4*4*4*4)/(1*2*3*4*5) - (4*4*4*4*4*4*4)/(1*2*3*4*5*6*7)

x=7 and n=11
sin 7 = 7^1/1! - 7^3/3! + 7^5/5! - 7^7/7! + 7^9/9! - 7^11/11!

result = 0;
for(int i=1;i<=n;i++) {
  int mul = 1;
  int fact = 1;
  if(i%2!=0) {
    for(j=1;j<=i;j++) {
       mul = mul * x;
       fact = fact * j;
    }
    result = result + x^i/i!;
  }

}

 */

public class SinxAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value for x");
        int x = sc.nextInt();
        double sum = 0.0;
        int k =0;
        for(int i=1;i<=n;i++) { //k=0, i=1; k=1,i=2; k=1, i=3
            double power = 1.0;
            double fact = 1.0;
            if(i%2 != 0) {
                for(int j=1; j<=i;j++) {
                    power = power*x;
                    fact = fact*j;
                }
                if(k%2 == 0) { //k=0, 0%2=0; k=1, 1%2!=0;
                    sum = sum +  (power/fact);
                } else {
                    sum = sum -  (power/fact);
                }
                k++; //k=1, i=1;k=1,i=2;k=2,i=3;
            }
        }
    }
}
