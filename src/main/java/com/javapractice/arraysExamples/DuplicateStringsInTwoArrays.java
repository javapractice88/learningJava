package com.javapractice.arraysExamples;

/**
 * write a program to find common elements in 2 array of string
 */
public class DuplicateStringsInTwoArrays {

    public static void main(String[] args) {

        String[] a = {"Mahaboob", "Anwar", "aahil","asad"};
        String [] a2 = {"abzal", "salma", "Aahil"};

        /**
         *
         * i=0;<a.lemgth;++      j=;0;<a2.length();++
         * a[0]                  a2[0 - length-1]
         * a[1]                 a2[0 - length-1]
         * a[2]                 a2[0 - length-1]
         */
        System.out.println("Common numbers in two array: ");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a2.length; j++) {

                if (a[i].equalsIgnoreCase(a2[j])) {


                    System.out.print(a[i] + ",");

                    break;

                }
            }
        }

    }
}
