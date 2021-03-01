package com.company;

public class TV {

    int channel;
    int volume;
    boolean on;

    public TV() {

        this.channel = 3;
        this.volume = 5;
        this.on = false;
    }

    public boolean isOn() {
        if (on == false){
            System.out.println("Telewizor jest wylaczony");
        }
        return on;
    }
}




