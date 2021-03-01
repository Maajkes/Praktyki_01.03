package com.company;

public class Main {

    public static void main(String[] args) {

        Remote pilot = new Remote();
        pilot.wlacztv();
        pilot.glosnosc(1);
        pilot.kanal(0);
        System.out.println(" Głośność telewizora: ");
        System.out.println(pilot.telewizor.volume);
        System.out.println(" Kanał: ");
        System.out.println(pilot.telewizor.channel);
    }
}