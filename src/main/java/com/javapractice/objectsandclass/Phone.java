package com.javapractice.objectsandclass;

/**
 * This class is used for explaning about Objects and classes using Phone class
 */
public class Phone {

    //Variable Declaration
    String brand; //start with small letter and camel case
    String color;
    int memory;
    int phoneNumber;


    //Create a Constructor
    Phone(String brand, String color, int memory, int phoneNumber) {
        this.brand = brand;
        this.color = color;
        this.memory = memory;
        this.phoneNumber = phoneNumber;
    }

    //Behaviour
    void call() {
        System.out.println("Call Triggered to this phone Number:- " + phoneNumber + "\n");
    }

    void message() {
        System.out.println("message sent to this phone Number:- " + phoneNumber + "\n");
    }

    void colorAndBrandOfMobile() {
        System.out.println("The brand of your mobile is " + brand + "\n");
        System.out.println("The color of your mobile is " + color);
    }

    public static void main(String[] args) {
        Phone samsung = new Phone("samsung", "black", 128, 987654321);
        samsung.call();
        samsung.message();
        samsung.colorAndBrandOfMobile();


        Phone iPhone = new Phone("Iphone", "purple", 512, 987654321);
        iPhone.call();
        iPhone.message();
        iPhone.colorAndBrandOfMobile();
    }
}
