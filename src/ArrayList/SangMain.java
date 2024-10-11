package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SangMain {
    private ArrayList<Sang> sangListe;
    private Scanner scanner;

public SangMain(){
    sangListe = new ArrayList<>();
    scanner = new Scanner(System.in);
}

    public static void main(String[] args) {
        SangMain program = new SangMain();
        program.start();
    }

public void start(){
    int valg;
    do{
        System.out.println("Velkommen til dit hjemmelavede Spotify! Vælg en mulighed:");
        System.out.println("1. Tilføj ny sang");
        System.out.println("2. Fjern en sang");
        System.out.println("3. Vis alle sange");
        System.out.println("4. Søg efter en sang");
        System.out.println("5. Rediger en sang");
        System.out.println("6. Afslut programmet");
        valg = scanner.nextInt();
        scanner.nextLine();

        switch (valg) {
            case 1:
                tilføjSang();
                break;
            case 2:
                fjernSang();
                break;
            case 3:
                visAlleSange();
                break;
            case 4:
                søgSang();
                break;
            case 5:
                redigerSang();
                break;
            case 6:
                System.out.println("Programmet afsluttes. Tak for brugen!");
                break;
            default:
                System.out.println("Ugyldigt valg. Prøv igen.");
        }
    } while (valg != 6);

}

private void tilføjSang(){
    System.out.println("Indtast sangtitel: ");
    String titel = scanner.nextLine();
    sangListe.add(new Sang(titel));
    System.out.println("Sang tilføjet: " + titel);
}

private void fjernSang(){
    System.out.println("Indtast sangtitel for at fjerne: ");
    String titel = scanner.nextLine();
    boolean fjernet = sangListe.removeIf(sang -> sang.getTitel().equalsIgnoreCase(titel));
    if (fjernet){
        System.out.println("Sang fjernet: " + titel);
    } else {
        System.out.println("Sang ikke fundet: " + titel);
    }
}

private void visAlleSange(){
    if (sangListe.isEmpty()) {
        System.out.println("Ingen sange i listen");
    } else {
        System.out.println("Sange i listen:");
        for (Sang sang : sangListe){
            System.out.println(sang);
        }
    }
}

private void søgSang(){
    System.out.println("Indtast sangtitel for at søge: ");
    String titel = scanner.nextLine();
    boolean fundet = false;
    for (Sang sang : sangListe){ //For each loop
        if (sang.getTitel().equalsIgnoreCase(titel)){
            System.out.println("Sang fundet: " + sang);
            fundet = true;
            break;
        }
    }
    if (!fundet){
        System.out.println("Sang ikke fundet: " + titel);
    }
}

private void redigerSang(){
    System.out.println("Indtast den titel på sangen du vil redigere: ");
    String gammelTitel = scanner.nextLine();
    for (Sang sang : sangListe){ //For each loop
        if (sang.getTitel().equalsIgnoreCase(gammelTitel)){
            System.out.println("Indtast ny titel: ");
            String nyTitel = scanner.nextLine();
            sang.setTitel(nyTitel);
            System.out.println("Sangtitel opdateret fra: " + gammelTitel + " til " + nyTitel);
            return;
        }
    }
    System.out.println("Sang ikke fundet: " + gammelTitel);
}

}
