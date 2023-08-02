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
 *   if(i%10 != 0) {
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
public class SinX {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = sc.nextInt();
        System.out.println("Enter a number n: ");
        int n = sc.nextInt(); // 1+ 3- 5+ 7-
        int sum = 0;
        for (int i =1; i<=n;i++){
            int power = 1;
            int fact = 1;
            if (i%2 !=0){
                for (int j =1; j<=i;j++){
                    power = power*x;
                    fact = fact*j;

                    sum = sum + (power/fact);
                }

                
            }

        }System.out.println(+sum);


        

    }
}
