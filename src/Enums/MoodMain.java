package Enums;

import java.util.Scanner;

public class MoodMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hvilket humør er du i? (Happy, Sad, Angry, Excited, Bored, Default)");
        Mood myMood = Mood.valueOf(sc.nextLine().toUpperCase());

        switch (myMood){
            case HAPPY:
                System.out.println("Du er glad");
                break;

            case SAD:
                System.out.println("Du er trist");
                break;

            case ANGRY:
                System.out.println("Du er sur");
                break;

            case EXCITED:
                System.out.println("Du er spændt");
                break;

            case BORED:
                System.out.println("Du keder dig");
                break;

            default:
                System.out.println("Du har intet mood");
                break;
        }

//        if(input.equalsIgnoreCase("Happy")){
//            myMood = Mood.Happy;
//        } else if (input.equalsIgnoreCase("Sad")){
//            myMood = Mood.Sad;
//        } else if (input.equalsIgnoreCase("Angry")){
//            myMood = Mood.Angry;
//        } else if (input.equalsIgnoreCase("Excited")){
//            myMood = Mood.Excited;
//        } else if (input.equalsIgnoreCase("Bored")) {
//            myMood = Mood.Bored;
//        }


    }




    }


