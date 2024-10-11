package Semester1;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int antal;
        int mel;

        System.out.println("Hvor mange cookies vil du bage?");
        antal = input.nextInt();

        System.out.println("Hvor meget mel vil du bruge?");
        mel = input.nextInt();

        System.out.print("Du skal bruge " + mel * antal + " " + " gram mel");
    }

}
