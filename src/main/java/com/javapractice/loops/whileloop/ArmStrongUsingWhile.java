package com.javapractice.loops.whileloop;

public class ArmStrongUsingWhile {

    public static void main(String[] args) {
        int i=1;
        System.out.println("The ArmStrong Numbers are : ");
        while (i<=200) {
            int sum=0;
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (rem*rem*rem);
                temp = temp/10;
            }
            if(i==sum) {
                System.out.print(i + ",");
            }
            i++;
        }

    }
}
