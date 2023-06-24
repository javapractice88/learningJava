package com.javapractice.loops.forloop.nestedforloops;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForWithNoCondition {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("length of the array :" + a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //Each element in the array will be assigned to arrayValue for each iteration
        System.out.println("For Each Output");
        for (int arrayValue: a) {
            System.out.println(arrayValue);
        }

        int k = 0;
        for(int i=0;;i++) {
            //System.out.println(i);
             k = k + 2;
            if (k>10)
                break;
        }
    }
}
