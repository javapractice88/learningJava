package com.javapractice.loops.foreachloop;

/**
 * This program will print the sum of the
 * elements in an array using for-each and for loop
 */
public class SumOfElementsInArrayForEach {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int mul = 1;
        System.out.println("******For loop******");
        for(int i=0; i<=nums.length-1; i++) {
           mul = mul * nums[i];
        }
        System.out.println("Sum of Array using for loop " + mul);



        System.out.println("******For-Each loop******");
        mul = 1;
        for (int value: nums) {
            mul = mul * value;
        }
        System.out.println("Sum of Array using for-each loop " + mul);
    }


}
