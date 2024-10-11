package Semester1;

import java.util.Scanner;

public class Stjernetegnpart2 {

    public static void main(String [] args) {
        System.out.println("Skriv den månede du har fødselsdag i og du får dit stjernetegn");

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Du er vædderen");
                break;

            case 2:
                System.out.println("Du er Tyren");
                break;

            case 3:
                System.out.println("Du er tvillinger");
                break;

            case 4:
                System.out.println("Du er krebsen");
                break;

            case 5:
                System.out.println("Du er løven");
                break;


            case 6:
                System.out.println("Du er jomfru");
                break;


            case 7:
                System.out.println("Du er vægt");
                break;

            case 8:
                System.out.println("Du er skorpion");
                break;

            case 9:
                System.out.println("Du er skytte");
                break;

            case 10:
                System.out.println("Du er stenbuk");
                break;


            case 11:
                System.out.println("Du er vandmand");
                break;


            case 12:
                System.out.println("Du er fisk");
                break;



        }

    }
}
