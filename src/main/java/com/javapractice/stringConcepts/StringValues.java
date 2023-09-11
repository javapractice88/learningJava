package com.javapractice.stringConcepts;

import java.util.Locale;

public class StringValues {

    public static void main(String[] args) {
        String s1 = "salma";
        String s2 = "mahaboob";
        String s4 = "haboob";

        String s3 = s1.toUpperCase(); // SALMA
        System.out.println(s1.indexOf('s'));
        System.out.println(s2.indexOf('h'));

        System.out.println(s1.charAt(0));

        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s2.compareToIgnoreCase(s3));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s2.compareToIgnoreCase(s4));

        //int result = s1.compareToIgnoreCase(s3);
        //compareToIgnoreCase :- compares 2 strings irrespective of case (upper or lower case) ,
        // and returns 0 if both are equal or
        // else returns positive or negative value.
        //https://www.programiz.com/java-programming/library/string/comparetoignorecase
        if(s1.compareToIgnoreCase(s3) == 0) {
            System.out.println(s1 +" is equal to " + s3);
        } else {
            System.out.println(s1 +" is not equal to " + s3);
        }

        //compareTo :- compares 2 strings
        // and returns 0 if both are equal
        // or else returns positive or negative value.
        //https://www.programiz.com/java-programming/library/string/compareto
        System.out.println(s1.compareTo(s3));

        //Length of a string
        System.out.println("length of String " + s1 + s1.length());
        System.out.println("length of String " + s2 + s2.length());

    }
}
