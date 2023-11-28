package com.javapractice.inheritance;

import com.javapractice.inheritance.InterfaceImplementation.ExampleInterfaceImpl;

public class StreetBike extends Bike{

    int spokes;

    public StreetBike(int spokes, int speed, int gears) {
        super(speed, gears);
        this.spokes = spokes;
    }

    public int getSpokes() {
        return spokes;
    }

    @Override
    public String toString() {
        return "Seat height :" + spokes;
    }

    public static void main(String[] args) {
        ExampleInterface exampleInterface = null;
        exampleInterface.checkEvenOrOdd(3);
        StreetBike streetBike = new StreetBike(3, 30, 12);
        System.out.println(streetBike.toString() + streetBike.getSpokes() + "  my Types are " + streetBike.tyres());
    }
}
