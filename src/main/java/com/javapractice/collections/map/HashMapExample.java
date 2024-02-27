package com.javapractice.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("abc", 123);
        hm.put("zzz", 345);
        hm.put("xxx", 564);

        for(Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " ::: " + e.getValue());
        }

        Map<Integer, Integer> hm2 = new HashMap<>();
        hm2.put(1, 200);
        hm2.put(2, 400);
        hm2.put(3, 200);
        hm2.put(1, 600);

        for (Map.Entry<Integer, Integer> ent:
             hm2.entrySet()) {
            System.out.println(ent.getKey() + ":::" + ent.getValue());
        }

        Map<Integer , String> rollNoStudentNameMap = new HashMap<>();

        rollNoStudentNameMap.put(101, "Aahil");
        rollNoStudentNameMap.put(102, "Mahaboob");

        /*Group students of a class
          1 -> 5 Students
          2 -> 6 Students
          3 -> 7 Students
          4 -> 10 Students
         */

        // Create a map with class and no of students
        Map<Integer, Integer> classStudentMap = new HashMap<>();
        classStudentMap.put(1, 5);
        classStudentMap.put(2, 6);
        classStudentMap.put(3, 7);
        classStudentMap.put(4, 10);

        //Create a map storing Students names in a different class

        Map<Integer, ArrayList<String>> classStudentNamesMap = new HashMap<>();

        //1st class
        ArrayList<String> firstClassStudentName = new ArrayList<>();
        firstClassStudentName.add("Aahil");
        firstClassStudentName.add("Mahaboob");
        classStudentNamesMap.put(1, firstClassStudentName);

        //2nd class
        ArrayList<String> secondClassStudentName = new ArrayList<>();
        secondClassStudentName.add("Mahira");
        secondClassStudentName.add("Aleena");
        classStudentNamesMap.put(2, secondClassStudentName);

        //3rd class
        ArrayList<String> thirdClassStudentName = new ArrayList<>();
        thirdClassStudentName.add("Abzal");
        thirdClassStudentName.add("Salma");
        thirdClassStudentName.add("Ayan");
        classStudentNamesMap.put(3, thirdClassStudentName);

        //4th class
        ArrayList<String> fourthClassStudentName = new ArrayList<>();
        fourthClassStudentName.add("Asad");
        fourthClassStudentName.add("Ayan");
        classStudentNamesMap.put(4, fourthClassStudentName);

        System.out.println("Get 3rd class student names::: "+ classStudentNamesMap.get(3));
        classStudentNamesMap.get(3).remove("Ayan");

        for (Map.Entry<Integer, ArrayList<String>> entry:
                classStudentNamesMap.entrySet()) {
            System.out.println(entry.getKey() + ":::" + entry.getValue());

            ArrayList<String> studentNames = entry.getValue();

            if (entry.getKey() == 4) {
                //entry.getValue().remove("Ayan");
                studentNames.remove("Ayan");
            }

           Iterator it = entry.getValue().iterator();

           while (it.hasNext()) {
               System.out.println(it.next());
           }
        }

    }
}
