package com.javapractice.loops.forloop;

public class PalandromInt {
    public static void main(String[] args) {
        int a = 123321;
        int temp = a;
        int reverse = getReverse(temp);
        if (a==reverse){
            System.out.println("this is a palindrome int:" +a);
        }
        else {
            System.out.println("this is not a palindrome int:" +a);
        }

    }

    private static int getReverse(int temp) {
        int reverse = 0;
        int remainder;

        while (temp >0){
            remainder =  temp % 10;// 1
            reverse = reverse *10 + remainder;
            temp = temp /10;


        }
        return reverse;
    }
}
//