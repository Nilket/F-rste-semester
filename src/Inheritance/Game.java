package Inheritance;

import java.util.Scanner;

public class Game {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Velkomst og valg af navn
        System.out.println("Tillykke med din nye tamagotchi!");
        System.out.println("Hvad skal den hedde?");
        String dyrNavn = sc.nextLine();

        //Valg mellem kat eller hund
        System.out.println("Vil du have en kat eller en hund?");
        String inputDyr = sc.nextLine();


        //Hund
        if (inputDyr.equalsIgnoreCase("Hund")) {
            Dog en = new Dog("", 6, "", 5, "");
            System.out.println("Tillykke med din nye hund!! " + dyrNavn);
            System.out.println("Det her er din nye hund! \n" +
                    "૮˶• ﻌ •˶ა\n" +
                    "./づ~ \uD83E\uDDB4");
            System.out.println(en.noise());

            System.out.println("Hvad vil du lave med " + dyrNavn + "?");
            System.out.println("1 - Lege");
            System.out.println("2 - Fodre");
            System.out.println("3 - Sove");
            System.out.println("4 - Sluk");
            int inputActEt = sc.nextInt();

            while (inputActEt != 4) {
                if (inputActEt == 1) {
                    en.Play();
                    System.out.println("Du leger med din tamagotchi!! - 2 energy ");
                    System.out.println("Hvad vil du lave med " + dyrNavn + "?");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActEt = sc.nextInt();
                }
                if (inputActEt == 2) {
                    en.Feed();
                    System.out.println("Du fodrer din tamagotchi!! + 1 energy");
                    System.out.println("Hvad vil du lave med " + dyrNavn + "?");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActEt = sc.nextInt();
                }
                if (inputActEt == 3) {
                    en.Sleep();
                    System.out.println("I begge tager en lur!! + 10 energy");
                    System.out.println("Hvad vil du lave med " + dyrNavn + "?");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActEt = sc.nextInt();
                }
                if (inputActEt == 4){
                    System.out.println("Vi ses :))");
                    System.exit(4);
                }
            }

            //Katten
        } else if (inputDyr.equalsIgnoreCase("Kat")) {
            Cat to = new Cat("", 2, "", 10, "");
            System.out.println("Tillykke med din nye kat!! " + dyrNavn);
            System.out.println("Det her er din nye kat!");
            System.out.println(" ╱|、\n" +
                    "(˚ˎ 。7  \n" +
                    "|、˜〵\n" +
                    "じしˍ,)ノ ");
            System.out.println(to.noise());

            //Aktivitet med dyret
            System.out.println("Hvad vil du lave med " + dyrNavn + "?");
            System.out.println("1 - Lege");
            System.out.println("2 - Fodre");
            System.out.println("3 - Sove");
            System.out.println("4 - Sluk");
            int inputActTo = sc.nextInt();

            while (inputActTo != 4 ) {
                if (inputActTo == 1) {
                    to.Play();
                    System.out.println("Du leger med din tamagotchi!! - 2 energy ");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActTo = sc.nextInt();
                }
                 else if (inputActTo == 2) {
                    to.Feed();
                    System.out.println("Du fodrer din tamagotchi!! + 1 energy");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActTo = sc.nextInt();
                }
                else if (inputActTo == 3) {
                    to.Sleep();
                    System.out.println("I begge tager en lur!! + 10 energy");
                    System.out.println("1 - Lege");
                    System.out.println("2 - Fodre");
                    System.out.println("3 - Sove");
                    System.out.println("4 - Sluk");
                    inputActTo = sc.nextInt();
                }
                if (inputActTo == 4){
                    System.out.println("Vi ses :))");
                    System.exit(4);
                }
            }
        }

        }
    }

