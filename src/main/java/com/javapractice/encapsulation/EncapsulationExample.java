package com.javapractice.encapsulation;

public class EncapsulationExample {

    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;


    public String getName() {
        return geekName;
    }

    public void setName(String geekName) {
        this.geekName = geekName;
    }

    public int getRoll() {
        return geekRoll;
    }

    public void setRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getAge() {
        return geekAge;
    }

    public void setAge(int geekAge) {
        this.geekAge = geekAge;
    }
}
