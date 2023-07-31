package com.javapractice.loops.forloop;

/**
 * As String is called a palindrome string if the reverse order of the string is same
 * Example :- RACECAR
 *
 * Example :- 123321
 */
public class PalindromeString {

    public static void main(String[] args) {

        String str = "RAARE";

        /**
         * 0 1 2 3 4
         * R A A R E
         * length 7
         * str.index(0) = str.index(6) str.length()-1
         * str.index(1) = str.index(5) str.length()-2
         * str.index(2) = str.index(4) str.length()-3
         * str.index(3) = str.index(3)
         * str.index(4) = str.index(2)
         * str.index(4) = str.index(1)
         *
         */

        System.out.println(str.indexOf('E'));
        System.out.println(str.length());


        System.out.println(str.charAt(4));
        System.out.println(str.charAt(1));



        int temp = 0;

        for (int i = 0; i < str.length() - 1/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                temp = 1;
                break;
            }
        }

        if (temp == 0) {
            System.out.println("This is palindrome number ");
        } else {
            System.out.println("This is Not palindrome number ");
        }

    }

}
