package com.javapractice.objectsandclass;

/**
 * Let’s create a Java program in
 * which we will create two objects of the Rectangle class and initialize value to these objects by calling perValue() method.
 *
 * Besides it, we will display state (data/value) of the objects by calling calculate() method using object reference variable
 * because we cannot call directly non-static member into the static region.
 *
 */
public class Rectangle {

    //Variable declaration
    int length;
    int breadth;

    boolean abc = true;
    boolean abc1;

    byte ac = 127;
    short sh = 32767;

    double f = 10.44567855555555555555;

    String s = "asdasda678t8dadajnda87a6r545uhb/9)/&%%/(";
    char ch = 'e';

    int a1 = 1;
    int a2 = 2;

    int[] a = {1,2,2,4,5,6};
    String[] s1 = {"a123", "b333", "222"};
    char[] ch1 = {'a', '3', '1'};

    //Constructor
    Rectangle(int length2, int breadth2) {
        this.length = length2;
        this.breadth = breadth2;
    }


    //Behaviour
    void calculate() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the Rectangle:" + perimeter);
    }

    void area() {
        int area = length * breadth;
        System.out.println("area of Rectangle:" + area);
        System.out.println("float:" + f);
        System.out.println("int array:" + a[1]);
        System.out.println("int array Length:" + a[3]);
    }

    public static void main(String[] args) {
        // Create the first object of the class.
        Rectangle rt = new Rectangle(20, 30);
        //rt.perValue(20, 30);

        // It will call perValue method and initialize values.
        // After that, it will be automatically initialized to the instance variables.
        rt.calculate(); // it will call calculate() method to display the output.
        rt.area();

        // Create the second object of the class.
        Rectangle rt2 = new Rectangle(50, 50);
        //rt2.perValue(50, 50);
        rt2.calculate();
        rt2.area();
    }
}