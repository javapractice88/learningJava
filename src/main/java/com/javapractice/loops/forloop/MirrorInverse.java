package com.javapractice.loops.forloop;

public class MirrorInverse {


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0 };
        if (checkMirrorInverse(arr)) {
            System.out.println("The array is mirror inverse");
        } else {
            System.out.println("The array is not a mirror inverse");
        }

    }

    private static boolean checkMirrorInverse(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            if(arr[arr[i]] != i) {
                return false;
            }
        }
        return true;
    }


}
