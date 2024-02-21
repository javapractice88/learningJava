package com.javapractice.inheritance.InterfaceImplementation;

import com.javapractice.inheritance.ExampleInterface;

public class ExampleInterfaceImpl implements ExampleInterface {


    @Override
    public String checkEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return "Even Number";
        } else {
            return "Not an Even Number";
        }
    }
}
