package com.javapractice.loops.dowhileloop;

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Multiplication Table:");
        int i=1;
        do {
            int j =1;
            do {
                int mul = i*j; //1*1, 1*2, 1*3
                System.out.print(mul + "\t");
                j++;
            } while (j<=10);
            i++;
            System.out.print("\n");
        } while (i<=13);
    }
}
