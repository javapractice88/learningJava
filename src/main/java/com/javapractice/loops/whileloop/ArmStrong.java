package com.javapractice.loops.whileloop;

//import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter  digit");
        //int digit = sc.nextInt(); // 1234
        for (int i = 1; i <= 200; i++) {
            int sum = 0;
            int remainder;
            int temp = i; // 1;2;3;4;................153;............200

            while (temp > 0) {
                remainder = temp % 10; //1; for i = 2, 2%10=2 ....; for i=153 153%10=3, 15%10=5, 1%10=1;
                sum = sum + (remainder * remainder * remainder);  // 0+(1*1*1) = 1; for i =2, 0+(2*2*2) = 9; for i =153 0+(3*3*3)=27, 27+(5*5*5) = 152, 152+(1*1*1) = 153;
                temp /= 10; //1/10=0; for i=2, 2/10 =0; for i =153 153/10 = 15, 15/10 = 1, 1/10 = 0;
            }
            if (i == sum) { // 1==1
                System.out.println(i + " ,");
            }
        }
    }

}