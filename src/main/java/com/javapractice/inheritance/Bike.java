package com.javapractice.inheritance;

public class Bike {

    int speed;
    int gears;

    //Constructor
    public Bike(int speed, int gears) {
        this.speed = speed;
        this.gears = gears;
    }

    public int speedUp(int increment) {
        return speed+=increment;
    }

    public int speedDown(int decrement) {
        return speed-=decrement;
    }

    public String tyres() {
        return "flat tyres";
    }

    public String toString() {
        return "My Speed is: "+ speed + "My Bike has " + gears + " gears";
    }

    public static void main(String[] args) {
        Bike bike = new Bike(10, 5); //constructor is used here
        System.out.println(bike.toString());
        int upSpeed = bike.speedUp(3);
        System.out.println(upSpeed);
        int downSpeed = bike.speedDown(4);
        System.out.println(downSpeed);
    }
}
