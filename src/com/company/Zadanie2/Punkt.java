package com.company;

public class Punkt {

    private final int x;
    private final int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Punkt anotherPoint) {

        double a = this.x - anotherPoint.getX();
        double b = this.y - anotherPoint.getY();

        return Math.sqrt(a + b);

    }

    public double roznica(int x2, int y2) {

        double a = this.x - x2;
        double b = this.y - y2;

        return Math.sqrt(a + b);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
