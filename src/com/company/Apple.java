package com.company;

public class Apple extends Fruit{
    private String color;
    private int diameter;

    public Apple(String name, String color, int diameter) {
        super.setName(name);
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }


    public void print() {
        System.out.println(getName() + " " + color + " " + diameter);

    }
}
