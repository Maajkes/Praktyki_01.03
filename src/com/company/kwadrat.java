package com.company;

public class kwadrat {

    public static void main(String[] args) {
        new kwadrat(6);
    }
    int pole;
    int bok;
    int obwod;

    public kwadrat (int bok){
        this.pole = bok * bok;
        this.bok = bok;
        this.obwod = bok + bok + bok + bok;

        System.out.println(" Bok wynosi = " + this.bok);
        System.out.println(" Pole wynosi = " + this.pole);
        System.out.println(" Obwod wynosi = " + this.obwod);

    }
}
