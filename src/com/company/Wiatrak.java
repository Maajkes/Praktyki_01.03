package com.company;

public class Wiatrak {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    double speed, radius;
    String color;


    void wiatraknow() {
        System.out.println("Szybkość: " + speed);
        System.out.println("Zasięg: " + radius);
        System.out.println("Kolor: " + color);
    }
    Wiatrak nowy1 = new Wiatrak();
    nowy1.speed = 2;
    nowy1.radius = 15;
    nowy1.color = "Zielony";

}







