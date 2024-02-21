package com.javapractice.StringBuffer;


/**
 * String s = "http://dynamic.ca/content/dam/xyzrrrr.jpg?path=/content/abx/bcd.html"
 */
public class StringBufferExamples {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("String Buffer" + sb);

        // StringBuffer sb1 = new StringBuffer("string");
        //System.out.println("String Buffer" + sb1);

        sb.append("String");
        System.out.println("String Buffer:::" + sb);

        String s = "";
        s = s.concat("String");
        System.out.println("String :::" + s);

        sb.append(" java");
        System.out.println("String Buffer:::" + sb);

        System.out.println("String :::" + s.concat(" Java") + "   s::" + s);


        sb.insert(0, "we are learning ");
        System.out.println("String Buffer:::" + sb);

        sb.insert(22, "s in");
        System.out.println("String Buffer:::" + sb);

        StringBuffer sb2 = new StringBuffer(s);



        String s2 = "http://xxx.yyy/content/dam/xyzrrrr.jpg?xyz=123&path=/content/abx/bcd.html&abc=567";
        String[] split = s2.split("=");
        System.out.println(split[1]);

        String[] firstSplit = s2.split("\\?");
        String[] secondSplit = firstSplit[1].split("&"); // {"path=/content/abx/bcd.html" ,"xyz=123", "abc=567"}
        for (String s1 : secondSplit) {
               /*
                  first iteration s1=  path=/content/abx/bcd.html
                */
            String[] thirdSplit = s1.split("="); //{"path", "/content/abx/bcd.html"}
            if (thirdSplit[0].equalsIgnoreCase("path")) {
                System.out.println(thirdSplit[1]);
            }
        }


        for (int i = 0; i < secondSplit.length; i++) {
            String s1 = secondSplit[i];
            String[] thirdSplit = s1.split("="); //{"path", "/content/abx/bcd.html"}
            if (thirdSplit[0].equalsIgnoreCase("path")) {
                System.out.println(thirdSplit[1]);
            }
        }
    }
}
