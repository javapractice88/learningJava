package com.javapractice.MethodOverriding;

public class MethodOverriding {

    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone.call(1516303864, false);
        iphone.message(1516303864);

        Iphone iphone1 = new Iphone();
        iphone1.call(1516303864, true);

        Phone phone = new Phone();
        phone.call(1516303864, true);
    }
}
