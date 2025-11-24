package com.example.demo_git_api.model;

public class Car {
    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }
    void print() {
        System.out.println("color: " + color);
        System.out.println("make: " + make);
    }




}
