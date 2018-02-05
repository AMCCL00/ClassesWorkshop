package com.company;

import java.util.Scanner;

public class Cat extends Pet {


    public Cat(String petName, int age) {
        super(petName, age);
    }
//    @Override
//    protected String petSounds() {
//        return "Meow";
//    }
    public String catto() {
        int catAge;
        switch (super.getAge()) {
            case 0: catAge = 0;
                    break;
            case 1: catAge = 19;
                    break;
            case 2: catAge = 24;
                    break;
            default:catAge = (super.getAge() - 2) * 4 + 24;
                    break;
        }
        String catInfo = (super.getPetName() + " is " + super.getAge() + " in human years, and " + catAge + " in cat years. \n");
        return catInfo;
    }
}
