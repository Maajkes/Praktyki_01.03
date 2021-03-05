package com.company;

import java.util.Scanner;

public class Zadanie1
{
    public int Pieniadze = 1000;
    public int ID = 1234;

    public static void main(String[] args)
    {
        boolean wpiszid = true;
        boolean menu = true;

        Zadanie1[] konta= new Zadanie1[10];

        for(int i = 0;i < 10;i++)
        {
            konta[i] = new Zadanie1();
            konta[i].ID = i + 1;
        }

        while(wpiszid)
        {
            System.out.println("Podaj ID:");
            Scanner scanner = new Scanner(System.in);
            int idkonta = scanner.nextInt();
            if(idkonta > 10)
            {
                wpiszid = false;
                System.out.println("No id like this here");
                break;
            }

            System.out.println(+idkonta);

            while(menu)
            {
                System.out.println("Menu ");
                System.out.println("1: Środki na koncie ");
                System.out.println("2: Wypłata ");
                System.out.println("3: Wpłata ");
                System.out.println("4: Wyjście ");

                System.out.println("Wybierz : ");
                Scanner scanner1 = new Scanner(System.in);
                int wybor = scanner.nextInt();

                switch(wybor)
                {
                    case 1:
                        System.out.println("Środki na koncie : ");
                        System.out.println(konta[idkonta].Pieniadze);
                        break;
                    case 2:
                        System.out.println("Ile chcesz wypłacić ?");
                        Scanner scanner2 = new Scanner(System.in);
                        int wartosc2 = scanner.nextInt();
                        if(konta[idkonta].Pieniadze < wartosc2)
                        {
                            System.out.println("Nie posiadasz tyle na koncie ");
                        }
                        else
                        {
                            konta[idkonta].Pieniadze -= wartosc2;
                        }
                        break;
                    case 3:
                        System.out.println("Ile chcesz wpłacić ?");
                        Scanner scanner3 = new Scanner(System.in);
                        int wartosc3 = scanner.nextInt();
                        konta[idkonta].Pieniadze += wartosc3;
                        break;
                    case 4:
                        menu = false;
                        break;
                    default:
                        System.out.println("Nie ma takiej opcji");
                }
            }
        }
    }
}
