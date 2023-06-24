package com.javapractice.loops.foreachloop;

public class SumOfArray1 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum =0;
        System.out.println("For Loop");

        for(int i =0; i<=nums.length-1;i++){

            sum+=nums[i];

            if(i==4){
                System.out.println(sum);
                break;
            }


        }

        System.out.println("For each Loop");
        sum =0;
        for(int each:nums){
            sum+=each;
            if(each==5){
                System.out.println("For each Loop " + sum);
                break;
            }
        }

    }
}
