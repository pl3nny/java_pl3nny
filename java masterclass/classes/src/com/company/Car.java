package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public int get_number_of_doors() {
        return doors;
    }

    public void set_number_of_doors(int doors) {
        this.doors = doors;
    }

    public int get_number_of_wheels() {
        return wheels;
    }

    public void set_number_of_wheels(int wheels) {
        this.wheels = wheels;
    }

    public String get_engine() {
        return engine;
    }

    public void set_engine(String engine) {
        this.engine = engine;
    }

    public String get_color() {
        return color;
    }

    public void set_color(String color) {
        this.color = color;
    }
}
