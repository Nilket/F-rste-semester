package Semester1;

import java.util.Scanner;

public class Decision {
    public static void main(String[] args){

        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        if (inputtedNum < 5){
            System.out.println("Enjoy your good luck");
        } else {
            System.out.println("Bad luck");
        }

    }

}
