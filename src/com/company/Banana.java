package com.company;

public class Banana extends Fruit{
    private int weight;
    private int length;

    public Banana(String name, int weight, int length) {
        super.setName(name);
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + weight + " " + length);

    }
}
