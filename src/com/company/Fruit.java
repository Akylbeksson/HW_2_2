package com.company;

public class Fruit implements Printable{
    private String name;

    public Fruit() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }
}
