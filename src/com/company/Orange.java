package com.company;

public class Orange extends Fruit{
    private String taste;
    private int numberOfSlices;

    public Orange(String name, String taste, int numberOfSlices) {
        super.setName(name);
        this.taste = taste;
        this.numberOfSlices = numberOfSlices;
    }

    public String getTaste() {
        return taste;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + taste + " " + numberOfSlices);

    }
}
