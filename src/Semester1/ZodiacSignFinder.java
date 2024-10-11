package Semester1;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month;
        int day;
        int year;

        System.out.println("Hvilken måned blev du født?");
        month = input.nextInt();

        System.out.println("Hvilken dag i måneden?");
        day = input.nextInt();

        if (month == 1 && day <= 20){
            System.out.println("DIT STJERNETEGN ER: STENBUKKEN");
        } else if (month == 1 && day >= 20){
            System.out.println("DIT STJERNETEGN ER: VANDMANDEN");
        }

        if (month == 2 && day <= 18){
            System.out.println("DIT STJERNETEGN ER: VANDMANDEN");
        } else if (month == 2 && day >= 18){
            System.out.println("DIT STJERNETEGN ER: FISKEN");
        }

        if (month == 3 && day <= 20){
            System.out.println("DIT STJERNETEGN ER: FISKEN");
        } else if (month == 3 && day >= 20){
            System.out.println("DIT STJERNETEGN ER: VÆDDEREN");
        }

        if (month == 4 && day <= 19){
            System.out.println("DIT STJERNETEGN ER: VÆDDEREN");
        } else if (month == 4 && day >= 19){
            System.out.println("DIT STJERNETEGN ER: TYREN");
        }

        if (month == 5 && day <= 21){
            System.out.println("DIT STJERNETEGN ER: TYREN");
        } else if (month == 5 && day >= 21){
            System.out.println("DIT STJERNETEGN ER: TVILLINGERNE");
        }

        if (month == 6 && day <= 21){
            System.out.println("DIT STJERNETEGN ER: TVILLINGERNE");
        } else if (month == 6 && day >= 21){
            System.out.println("DIT STJERNETEGN ER: KREBSEN");
        }

        if (month == 7 && day <= 23){
            System.out.println("DIT STJERNETEGN ER: KREBSEN");
        } else if (month == 7 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: LØVEN");
        }

        if (month == 8 && day <= 23){
            System.out.println("DIT STJERNETEGN ER: LØVEN");
        } else if (month == 8 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: JOMFRUEN");
        }

        if (month == 9 && day <= 23){
            System.out.println("DIT STJERNETEGN ER: JOMFRUEN");
        } else if (month == 9 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: VÆGTEN");
        }

        if (month == 10 && day <= 23){
            System.out.println("DIT STJERNETEGN ER: VÆGTEN");
        } else if (month == 10 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: SKORPIONEN");
        }

        if (month == 11 && day <= 23){
            System.out.println("DIT STJERNETEGN ER: SKORPIONEN");
        } else if (month == 11 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: SKYTTEN");
        }

        if (month == 12 && day <= 22){
            System.out.println("DIT STJERNETEGN ER: SKYTTEN");
        } else if (month == 12 && day >= 23){
            System.out.println("DIT STJERNETEGN ER: STENBUKKEN");
        }

    }

}
