package com.company;

public class Main {

    public static void main(String[] args) {
 
        Punkt point1 = new Punkt(4, 5);
        Punkt point2 = new Punkt();

        System.out.println("Odległość: " + point1.calculateDistance(point2));

    }
}
