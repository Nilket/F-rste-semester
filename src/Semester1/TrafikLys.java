package Semester1;

import java.util.Scanner;

public class TrafikLys {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tast rød, gul eller grøn");
        String userInput = sc.nextLine();
            switch (userInput) {
                case("Rød"):
                    System.out.println("Stop");
                    break;

                case("gul"):
                    System.out.println("Vent");
                    break;

                case("Grøn"):
                    System.out.println("Kør");
                    break;

                default:
                    System.out.println("Du kan ikke køre bil");
                    break;


            }


            String result = (userInput.contains("rød") ? "Det er  ikke sikkert at gå over" : "Det er sikkert at gå over");
            System.out.println(result);
    }
}
