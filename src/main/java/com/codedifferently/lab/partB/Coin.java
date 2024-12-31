package com.codedifferently.lab.partB;

public class Coin implements Comparable<Coin>{
    private String name;
    private double value;

    public Coin() {
        this.name = "Coin Value";
        this.value = 0.0;
    }

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int compareTo(Coin otherCoin) {
        return Double.compare(this.value, otherCoin.value);
    }

    public String toString() {
        return "Name: " + getName() + ", Value: $" + getValue();
    }
}


