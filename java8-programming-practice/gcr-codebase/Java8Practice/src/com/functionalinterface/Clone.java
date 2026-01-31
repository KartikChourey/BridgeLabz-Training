package com.functionalinterface;

class Prototype implements Cloneable {
    int value = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();

        System.out.println(p2.value);
    }
}
