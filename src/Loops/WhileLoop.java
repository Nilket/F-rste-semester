package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean IsOnRepeat = true;

        while (IsOnRepeat){

            System.out.println("Playing current song");
            System.out.println("Do you want to take this song off repeat? if so, answer yes");
            String input = scanner.next();

            if ("yes".equals(input)){
                IsOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

    }

}
