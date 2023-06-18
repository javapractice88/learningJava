package com.javapractice.objectsandclass;

public class Student {

    // Declaration of state/Properties. Fields Declaration.
    String name; // Instance variable.
    int rollNo; // Instance variable.
    int id;
    int age; // variable.


    // Declaration of constructor. If you don’t explicitly define a constructor, the compiler automatically adds a default
    // constructor inside the class. A constructor can be divided into two types, such as default constructor and user-defined constructor.
    Student(String name2, int rollNo2, int id2, int age2)
    {
        // Constructor body.
        name = name2;
        rollNo = rollNo2;
        id = id2;
        age = age2;
    }

    // Declaration of Actions. This is nothing but a method inside a class.
    void display() // Instance method.
    {
        // method body.
        System.out.println("Name : " + name + "\n" + "Roll No:- " + rollNo + "\n" + "id:- " + id + "\n" + "age:- " + age + "\n");

    }

    // Main Method that provides the entry point to start the execution of any program.
    public static void main(String[] args)
    {
        Student mahaboob = new Student("mahaboob", 1, 7000, 33);
        mahaboob.display();

        Student salma = new Student("salma", 2, 7001, 34);
        salma.display();

        Student abzal = new Student("abzal", 3, 7002, 32);
        abzal.display();
    }
}
