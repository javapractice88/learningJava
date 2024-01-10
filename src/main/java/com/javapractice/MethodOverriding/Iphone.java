package com.javapractice.MethodOverriding;

public class Iphone extends Phone{

    public void call(double num, boolean isInternetAvailable) {
        if(isInternetAvailable) {
            System.out.println("Face Time call initiated to " + num);
        } else {
            System.out.println("Cannot do the Wifi Calling");
        }
    }

}
