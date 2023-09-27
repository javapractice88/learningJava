package com.javapractice.stringConcepts;

public class SwappingPairsofCharacters {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        char[] ch = str.toCharArray();

        for(int i=0; i< str.length()-1;i+=2) {
            char temp = ch[i]; //ch[0]=G
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        System.out.println(String.valueOf(ch));

    }
}
