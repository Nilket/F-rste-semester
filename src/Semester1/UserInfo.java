package Semester1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv dit navn");
        String navn = input.nextLine();

        System.out.println("Hvad er din yndlingsfarve?");
        String farve = input.nextLine();

        System.out.println("Dit navn er " + navn + " Og din yndlingsfarve er " + farve);

    }

}
