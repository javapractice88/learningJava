package com.javapractice.inheritance;

public class MountainBike extends Bike{

    int seatHeight;

    public MountainBike(int seatHeight, int speed, int gears) {
        super(speed, gears);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public String toString() {
        return "Seat height :" + seatHeight;
    }

    @Override
    public String tyres() {
        return super.tyres() + " and strong tyres";
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3, 30, 12);
        System.out.println(mountainBike.toString() + mountainBike.getSeatHeight());
    }
}
