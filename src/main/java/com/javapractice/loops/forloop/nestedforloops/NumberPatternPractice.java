package com.javapractice.loops.forloop.nestedforloops;
/**
 * This program prints the below pattern
 * 5 4 3 2 1
 *   4 3 2 1
 *     3 2 1
 *       2 1
 *         1
 */
public class NumberPatternPractice {
    public static void main(String[] args) {
        for(int i =5; i>=1; i--){
            int k =0;
            for(int j=i; j>=1; j--){

                while((5-i)>k){
                    System.out.print("  ");
                    k++;
                }
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
