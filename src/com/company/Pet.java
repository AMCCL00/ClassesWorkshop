package com.company;

public class Pet {

    public Pet() {

        // this is used when you have two variables of the same name in different classes and u want to access the one from the local class.

    }

    private String petName;
    private int age;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet(String petName, int age) {
        this.petName = petName;
        this.age = age;


    }
}
