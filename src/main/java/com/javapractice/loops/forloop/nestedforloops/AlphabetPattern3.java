package com.javapractice.loops.forloop.nestedforloops;

public class AlphabetPattern3 {
    public static void main(String[] args) {
        int k =1;
        System.out.println("digit Pattern:");
        for(int i=1;i<=5;i+=2){
            for(int j =5;j>=1; j--){
                if(j>i)
                System.out.print(" ");
                else
                System.out.format("%d " ,k++);
            }

            System.out.println(" ");
        }
    }
}
