package com.javapractice.inheritance;

public class RacingBike extends Bike{

    int seatHeight;

    public RacingBike(int seatHeight, int speed, int gears) {
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

    public static void main(String[] args) {
        RacingBike racingBike = new RacingBike(3, 30, 12);
        System.out.println(racingBike.toString() + racingBike.getSeatHeight() + "  my Types are " + racingBike.tyres());
    }
}
