package com.javapractice.stringConcepts;

/**
 * Input: originalString = "Computer Portal",
 *               stringToBeInserted = "Science ",
 *               index = 8
 * Output: "Computer Science Portal"
 */
public class InsetStringInsideAString {

    public static void main(String[] args) {
        String originalString = "We are java";
        String stringToBeInserted = "learning ";
        int index = 6;
        

        System.out.println(originalString.substring(0, index));
        String initialString = originalString.substring(0, index+1);// " Computer"
        System.out.println(originalString.substring(index));
        String remainingString = originalString.substring(index+1);// " poral"

        String finalStringAfterInsert = initialString.concat(stringToBeInserted).concat(remainingString);
        System.out.println(finalStringAfterInsert);

        System.out.println(originalString.substring(0, index+1) + stringToBeInserted + originalString.substring(index));

        //StringBuffer append
        StringBuffer sb = new StringBuffer(initialString);
        sb.append(stringToBeInserted).append(remainingString);

        System.out.println(sb);

        //StringBuffer insert
        StringBuffer sbInsert = new StringBuffer(originalString);
        sbInsert.insert(index+1, stringToBeInserted);
        System.out.println(sbInsert);




    }
}
