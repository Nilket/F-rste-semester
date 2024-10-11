package Semester1;

import java.util.Random;
import java.util.Scanner;

public class BlackJackDiceGame {

        public static void main (String[] args) {
            String playAgain = "y";

            while (playAgain.equals("y")) {
                int playerSum = rollDice();
                int computerSum = rollDice();

                System.out.println("Du ruller med terningerne og får: " + "\n" + playerSum);
                System.out.println("Vil du slå igen? y/n");
                Scanner scanner = new Scanner(System.in);
                String playerSvar = scanner.nextLine();

                while (playerSvar.equals("y")) {
                    playerSum += rollDice();
                    if(computerSum <= 16){
                        computerSum += rollDice();
                    }
                    if (playerSum == 21) {
                        System.out.println("Du slår med terningerne igen, din samlede værdi er nu: " + "\n" + playerSum);
                        System.out.println("BLACKJACK! Du vandt!");
                        System.out.println("[y] for at prøve igen, [n] for at afslutte");
                        playAgain = scanner.nextLine();
                    }
                    if (playerSum > 21) {
                        System.out.println("Du slår med terningerne igen, din samlede værdi er nu: " + "\n" + playerSum);
                        System.out.println("Du bustede, prøv igen.");
                        playerSvar = "n";
                        System.out.println("[y] for at prøve igen, [n] for at afslutte");
                        playAgain = scanner.nextLine();
                    } else {
                        System.out.println("Du slår med terningerne igen, din samlede værdi er nu: " + "\n" + playerSum);
                        System.out.println("Vil du slå igen? y/n");
                        playerSvar = scanner.nextLine();
                    }

                    if (playerSvar.equals("n") && playerSum <= 21) {
                        System.out.println("Computerens værdi er: " + "\n" + computerSum);
                        if (computerSum > playerSum) {
                            System.out.println("Computeren vinder.");
                            System.out.println("[y] for at prøve igen, [n] for at afslutte");
                            playAgain = scanner.nextLine();
                        } else if (computerSum == playerSum) {
                            System.out.println("Uafgjort! Derfor vinder computeren. Huset vinder altid." + "\n" + "Computerens samlede værdi var " + computerSum + "\n" + "og din samlede værdi var " + playerSum);
                            System.out.println("[y] for at prøve igen, [n] for at afslutte");
                            playAgain = scanner.nextLine();
                        } else {
                            System.out.println("Du har vundet!");
                            System.out.println("[y] for at prøve igen, [n] for at afslutte");
                            playAgain = scanner.nextLine();
                        }
                    }
                }

            }

        }

        public static int rollDice() {
            Random rand = new Random();
            return rand.nextInt(11) + 2;

        }
    }
