package com.javapractice.inheritance;

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
        StreetBike streetBike = new StreetBike(3, 30, 12);
        System.out.println(streetBike.toString() + streetBike.getSpokes() + "  my Types are " + streetBike.tyres());
    }
}
