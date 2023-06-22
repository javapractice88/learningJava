package com.javapractice.loops.foreachloop;

public class ForEachExample1 {

    public static void main(String[] args) {
        // Declare an array with 5 elements.
        String cities[] = {"Dhanbad", "Mumbai", "Delhi", "New York", "Tinpahar" };

        // Using for each loop to retrieve elements (cities) from an array.
        System.out.println("Name of cities:");
        for(String city : cities)
        {
            System.out.println(city); // city represents each element of an array.
        }
    }
}
