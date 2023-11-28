package com.javapractice.inheritance.InterfaceImplementation;

import com.javapractice.inheritance.ExampleInterface;

public class AnimalImpl implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Animal Sound is cccc");
    }

    @Override
    public String sleep() {
        return "Slept";
    }


    public static void main(String[] args) {
        AnimalImpl pig = new AnimalImpl();
        System.out.println(pig.sleep());
        pig.animalSound();
     }

    @Override
    public String checkEvenOrOdd(int i) {
        return "even";
    }
}
