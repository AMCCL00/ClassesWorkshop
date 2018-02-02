package com.company;

import java.util.Scanner;

public class Dog extends Pet {

    public Dog(String petName, int age) {
        super(petName, age);
//    }
//
//    @Override
//    protected String petSounds() {
//        return "bork bork woof woof";
    }
    public void doggo(){
        int dogAge = getAge() * 7;
        System.out.println(getPetName() + " is " + getAge() + " in human years, and " + dogAge + " in dog years. \n");
    }
}
