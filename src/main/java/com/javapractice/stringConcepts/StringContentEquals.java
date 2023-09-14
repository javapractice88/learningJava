package com.javapractice.stringConcepts;

/**
 * Join
 * Concatination
 * ContentEquals
 * StartsWith
 * EndsWith
 * replace First
 */
public class StringContentEquals {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        sb.append("cef");
        sb.append("dje");
        System.out.println(String.valueOf(sb));

        String s1 = "Java";
        System.out.println(s1.concat("Learning"));

        String s2 = "We are learning Java";
        System.out.println(s2.startsWith("We "));
        System.out.println(s2.startsWith("e a", 1));

        System.out.println(s2.endsWith("Java"));



        System.out.println(String.join("+", s1, "Learning"));


        String str1 = "aabbaaac";
        // the first occurrence of "aa" is replaced with "zz"
        System.out.println(str1.replaceFirst("aa", "zz")); // zzbbaaac

        //Same like Substring
        String str = "Java Programming";
        System.out.println(str.subSequence(3, 8)); // a Pro

        // creating a char array
        //Craates string into character array
        char[] result;

        result = str.toCharArray();
        System.out.println(result); // Java Programming

        //Check if the charter in a string is digit or not and convert to Integer if it a digit
        String str3 = "Ja2vr4";

        for(int i=0; i<str3.length();i++) {
            int digits = 0;
            if(Character.isDigit(str3.charAt(i))) {
                digits = Integer.parseInt(String.valueOf(str3.charAt(i)));
                System.out.println(digits);
            }

        }


    }
}
