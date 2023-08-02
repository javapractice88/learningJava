package com.javapractice.loops.foreachloop;

public class AlternateSumOfHalfNumbersInArray {

    public static void main(String[] args) {

        int nums[] = {5,6,8,2,0,3,7,1,7,10,45,23,75,64};
        int sum = 0;
        System.out.println("For Loop");

        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
            if (i == 4) {
                break;
            }
        }
        System.out.println(sum);

        for (int i = 0; i < nums.length/2; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
        System.out.println("For each Loop");
        sum = 0;
        for (int each : nums) {
            sum += each;
            if (each == 5) {
                break;
            }
        }
        System.out.println("For each Loop " + sum);

        System.out.println("For each Loop with counter");
        sum = 0;
        int noOfIterations = 0;
        for (int each : nums) {
            sum += each;
            if (noOfIterations == nums.length/2) {
                break;
            }
            noOfIterations++;
        }
        System.out.println("For each Loop " + sum);

    }

}
