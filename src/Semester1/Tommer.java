package Semester1;

import java.util.Scanner;

public class Tommer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tomme;

        System.out.println("Hej og velkommen til tommeberegneren");
        System.out.println("Hvor mange tommer ønsker du at omregne til cm?");
        tomme = sc.nextDouble();
        System.out.println("Du har indtastet " + tomme + " Det giver " + tomme * 2.54 + " i cm");
    }
}
