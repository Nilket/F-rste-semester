package Functions;

import java.util.Scanner;

public class FunctionsTest {

    public static void announceTeaTime(){
        System.out.println("It's time for tea!");
        System.out.println("Type in a random word to start tea time!");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!!!!");
    }


    public static void main(String[] args){
        announceTeaTime();


    }
}
