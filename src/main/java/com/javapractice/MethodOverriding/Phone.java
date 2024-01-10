package com.javapractice.MethodOverriding;

public class Phone {

    public void call(double num, boolean isInternetAvailable) {
        System.out.println("Called to " + num);
    }

    public void message(double num) {
        System.out.println("Sent Message to " + num);
    }
}
