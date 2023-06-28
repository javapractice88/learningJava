package com.javapractice.loops.forloop;

import java.util.Scanner;


//https://www.cuemath.com/numbers/hcf-highest-common-factor/

public class HcfOfaNumber2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        do
        {
            remainder = dividend % divisor;  // 18%27 = 18

            if(remainder == 0)
            {
                hcf = divisor;
            }
            else
            {
                dividend = divisor;
                divisor = remainder;
            }

        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
    }
}
