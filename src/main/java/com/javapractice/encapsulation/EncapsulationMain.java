package com.javapractice.encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setAge(15);
        encapsulationExample.setRoll(2345);
        encapsulationExample.setName("erwer");

        System.out.println(encapsulationExample.getAge());
        System.out.println(encapsulationExample.getRoll());
        System.out.println(encapsulationExample.getName());
    }
}
