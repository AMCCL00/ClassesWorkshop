package com.company;

public class Pet {

    public Pet() {

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
