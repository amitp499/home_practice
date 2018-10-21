package com.amit.Abstract;

public class Animal_Main {

    public static void main(String[] args) {
        Animal d = new dog();
        Animal c = new Cat();
        Animal l = new lion();

        d.speak();
        l.speak();
        c.speak();
    }
}
