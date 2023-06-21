package com.javapractice.loops.forloop;

public class SumOfTheCubes {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for(; ;){
            sum = sum + (i * i * i);
            i++;
            if(i >= 5) break; // If the i value exceeds 5, then come out of this loop.
        }
        System.out.println("Sum: " +sum);
    }
}
