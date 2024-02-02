package com.javapractice.abstraction;

import com.javapractice.inheritance.MountainBike;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NonAbstract extends AbstractionExample1{

    private int r;

    public NonAbstract(int r) {
        this.r = r;
    }


    @Override
    public void testAbstract(int c) {
        int a = 5;
        System.out.println(c+a);
    }

    @Override
    public void abstractMethod() {
        System.out.println("This method is executed in NonAbstract Class");
    }

    @Override
    public double getArea() {
        return Math.PI * r *r;
    }

    public static int staticMethod(int c) {
        return c+5;
    }

    public static void main(String[] args) {


        ArrayList<MountainBike> al = new ArrayList<>();
        MountainBike mountainBike = new MountainBike(2, 4,7);
        MountainBike mountainBike2 = new MountainBike(3, 4,7);
        al.add(mountainBike);
        al.add(mountainBike2);

        Iterator<MountainBike> it = al.iterator();
        while (it.hasNext()) {
            MountainBike bike = it.next();
            System.out.println(bike.getSeatHeight());
        }




        AbstractionExample1 ab = new NonAbstract(6);
        ab.abstractMethod();
        ab.test();
        ab.testAbstract(7);
        AbstractionExample1 ab2 = new NonAbstract(6);
        ab2.testAbstract(8);
        NonAbstract.staticMethod(7);
        //AbstractionExample1.staticMethod(8);
        System.out.println(ab.str);
    }
}
