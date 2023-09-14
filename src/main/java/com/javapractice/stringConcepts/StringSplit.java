package com.javapractice.stringConcepts;

/**
 * https://www.programiz.com/java-programming/library/string/split
 */
public class StringSplit {

    public static void main(String[] args) {

        String s1 = "salma";
        String s2 = "mahaboboc";
        //Split a String
        String s5 = "we are learning Java";
        String[] stringArray = s5.split(" ");
        System.out.println(stringArray[0]);
        System.out.println(stringArray);
        for (String s: stringArray) {
            System.out.println(s);
        }

        String[] stringArray2 = s1.split("l"); //{"sa","ma"}
        for (String s:  stringArray2) {
            System.out.println(s);
        }

        String[] stringArray3 = s2.split("hab");
        System.out.println(stringArray3[0]);
        for (String s:  stringArray3) {
            System.out.println(s);
        }

        for(int i=0; i < stringArray3.length; i++) {
            System.out.println(stringArray3[i]);
        }

        //Splits the string with the spaces(" ")  only till the limit is reached.
        String[] splitWithIndex = s5.split(" ", 2);

        for (String s:  splitWithIndex) {
            System.out.println(s);
        }

        String[] splitWithIndex2 = s2.split("o",-3);

        for (String s:  splitWithIndex2) {
            System.out.println(s);
        }

        String s6 = "we*are+learning:Java";
        String s7 = "learning";
        for (String s:  s6.split(s7)) {
            System.out.println(s);
        }


    }
}
