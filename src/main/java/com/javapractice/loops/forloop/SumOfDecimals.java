package com.javapractice.loops.forloop;

import java.util.Scanner;

public class SumOfDecimals {

    

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num : ");
            int num = sc.nextInt();
            double sum = 0;


            for(int i = 1; i<=num;i++){



                sum = sum + 1/i;





            }
            System.out.println("numbers are:" + sum );

        }
    }

}
