package com.amit.Interface;

public class animal_feed_main {

    public static void main(String[] args) {

        animalFeeder a = new Goat();
        animalFeeder b = new Tiger();

        zookeeper zo = new zookeeper();

          zo.feed(a);
        zo.feed(b);

        System.out.println("--------------------------------------------");
        a.feedAnimal();
        b.feedAnimal();

    }
}
