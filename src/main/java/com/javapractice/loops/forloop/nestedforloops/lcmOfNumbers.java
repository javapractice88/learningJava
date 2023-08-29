package com.javapractice.loops.forloop.nestedforloops;

public class lcmOfNumbers {

    public static void main(String[] args) {
        int a = 3,b=6;

        int greaterNum = findGreater(a, b);
        while (true) {
            if (lcm(greaterNum, a, b)) {
                break;
            }
            greaterNum++;
        }

        int greaterNum2 = findGreater(a, b);
        for (int i=greaterNum2;;i++) {
            if (lcm(i, a, b)) {
                break;
            }
        }
    }
    private static boolean lcm(int i, int a, int b) {
        if(i % a ==0 && i % b ==0) {
            System.out.println("LCM is "+ i);
            return true;
        }
        return false;
    }
    private static int findGreater(int a, int b) {
        return a > b ? a : b;
    }


}
